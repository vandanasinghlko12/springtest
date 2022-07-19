package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
    //model.addAttribute("name","vandana singh");
    
    List<String> friends=new ArrayList<String>();
   friends.add("vandana");
   friends.add("sushil");
   friends.add("rudransh");
   model.addAttribute("f",friends);
		
		return "index" ;
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelandview =new ModelAndView();
		System.out.println("this is help");
		modelandview.addObject("name","ranjana");
		modelandview.setViewName("help");
		List<Integer> list=new ArrayList<Integer>();
		list.add(123);
		list.add(345);
		list.add(789);
		list.add(675);
		
		modelandview.addObject("marks",list);
		return modelandview;
	}

}
