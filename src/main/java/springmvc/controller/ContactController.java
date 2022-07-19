package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}

	@RequestMapping(path ="/processform", method = RequestMethod.POST)
	public String processform(@RequestParam("email") String email, @RequestParam("username") String username,
			@RequestParam("password") String password,Model model) {
		
		System.out.println("email"+email);
		System.out.println("name"+username);
		System.out.println("password"+password);
		
		model.addAttribute("email", email);
		model.addAttribute("name",username);
		model.addAttribute("password",password);
		return "success";
	}
}
