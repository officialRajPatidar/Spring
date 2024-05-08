package springmvc.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.bean.User;
import springmvc.service.UserService;

@Controller
public class ContactCtl {

	@Autowired
	private  UserService uservice;
	
	@ModelAttribute
	public void commondata(Model m) {
		m.addAttribute("heading","welcom here..");
		m.addAttribute("des","hi we are here to learn spring");
		
		
		
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handler(@ModelAttribute User user, Model model) {
		
		int createduser= this.uservice.creatgeUser(user);
		model.addAttribute("succ","user has been added"+createduser);
		System.out.println(user.getUname());
		return "success";
	}
	
	
	

	
	
	
	
//	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
//	public String handler(@RequestParam("email")String uemail,
//			@RequestParam("uname") String uname,
//			@RequestParam("pass") String upass,
//			Model model
//			) {
//		model.addAttribute("email" ,uemail);
//		model.addAttribute("name", uname);
//		model.addAttribute("pass", upass);
//		
//		return "success";
//	}
	
}
