package springmvc.ctl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeCtl {

	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "raj patidar");
		
		List <String> names = new ArrayList<String>();
		names.add("prabla");
		names.add("shyam");
		names.add("ram");
		names.add("rajaram");
		model.addAttribute("n",names);
		
		
		System.out.println("this is home url");
		
		
		
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("in the about page url");
	 return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help () {
		ModelAndView view = new ModelAndView();
		view.addObject("name","raj patidar");
		view.setViewName("help");
		return view;
	}
}
