package com.example.hrms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.hrms.dto.AdminInfoDto;
import com.example.hrms.dto.EnquiryDto;
import com.example.hrms.dto.UserDto;
import com.example.hrms.model.AdminInfo;
import com.example.hrms.model.Enquiry;
import com.example.hrms.model.User;
import com.example.hrms.repo.AdminInfoRepo;
import com.example.hrms.repo.EnquiryRepo;
import com.example.hrms.repo.JobInfoRepo;
import com.example.hrms.repo.UserRepo;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	@Autowired
	EnquiryRepo erepo;// variable of EnquiryRepo interface
	@Autowired
	UserRepo urepo;// variable of UserRepo interface
	@Autowired
	AdminInfoRepo airepo;// variable of UserRepo interface
	@Autowired
	JobInfoRepo jirepo;

	@GetMapping("/index")
	public String showIndex() {
		return "index";
	}

	@GetMapping("/aboutus")
	public String showAboutUshhg() {
		return "aboutus";
	}

	@GetMapping("/registration")
	public String showRegistration(Model model) {
		UserDto udto = new UserDto();
		model.addAttribute("udto", udto);
		return "registration";
	}

	@GetMapping("/login")
	public String showlogin() {
		return "login";
	}
	
	@GetMapping("/jobs")
	public String showJobs(Model model) {
		model.addAttribute("totaljobs",jirepo.count());
		model.addAttribute("totaluser",urepo.count());
		return "jobs";
	}

	@GetMapping("/contactus")
	public String showContactUs(Model model) {
		EnquiryDto edto = new EnquiryDto();
		model.addAttribute("edto", edto);
		return "contactus";
	}

	@PostMapping("/contactus")
	public String saveEnquiry(@ModelAttribute EnquiryDto edto, RedirectAttributes attrib) {
		Enquiry enq = new Enquiry();
		enq.setName(edto.getName());
		enq.setAddress(edto.getAddress());
		enq.setContactno(edto.getContactno());
		enq.setEmailaddress(edto.getEmailaddress());
		enq.setEnquirytext(edto.getEnquirytext());
		erepo.save(enq);
		attrib.addFlashAttribute("msg", "Enquiry is saved.");
		return "redirect:/contactus";
	}

	@PostMapping("/registration")
	public String saveJobSeeker(@ModelAttribute UserDto udto, RedirectAttributes attrib) {
		User user = new User();
		user.setName(udto.getName());
		user.setGender(udto.getGender());
		user.setContactno(udto.getContactno());
		user.setEmailaddress(udto.getEmailaddress());
		user.setPassword(udto.getPassword());
		user.setQualification(udto.getQualification());
		user.setExperience(udto.getExperience());
		user.setKeyskills(udto.getKeyskills());
		user.setAddress(udto.getAddress());
		urepo.save(user);
		attrib.addFlashAttribute("msg", "user is registered.");

		return "redirect:/registration";
	}

	@PostMapping("/login")
	public String showDashboard(@RequestParam String emailaddress, @RequestParam String password,
			HttpSession session, RedirectAttributes redirectAttributes) {
		
		Optional<User>  user =urepo.findByEmailaddressAndPassword(emailaddress, password);
		if(user.isPresent())
		{
			session.setAttribute("user",user.get());
			return "redirect:/user/userdash";
		}
		
		redirectAttributes.addFlashAttribute("msg","Invalid email and password");
		
		return "redirect:/login"; 
	}
	
	
	@GetMapping("/adminlogin")
	public String showAdminLogin(Model model) {
		AdminInfoDto aidto=new AdminInfoDto();
		model.addAttribute("aidto", aidto);
		return "adminlogin";
	}
	@PostMapping("/adminlogin")
	public String adminLogin(@ModelAttribute AdminInfoDto aidto,
	                         RedirectAttributes attrib,HttpSession session) {
			String adminid=aidto.getAdminid();
			String password=aidto.getPassword();
			try {
				  AdminInfo admin=airepo.findById(adminid).get();
				  if(admin.getPassword().equals(password)) {
					  //attrib.addFlashAttribute("msg", "Welcome to Admin Dashboard.");
					  session.setAttribute("admin", admin);
					  return "redirect:/admin/admindashboard";
				  }
				  else {
					  attrib.addFlashAttribute("msg", "Invalid adminid/password are wrong.");
					  return "redirect:/adminlogin";
				  }
			} catch (Exception e) {
				 attrib.addFlashAttribute("msg", "Invalid adminid/password are wrong.");
				 return "redirect:/adminlogin";
			}
	    
	}
	
}
