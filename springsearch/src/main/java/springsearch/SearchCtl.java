package springsearch;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchCtl {

	@RequestMapping("/home")
	public  String home() {
		System.out.println("onhome");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query , RedirectAttributes redirectAttributes) {
	    RedirectView redirectview = new RedirectView();
	    if(query.isBlank()) {
	        redirectAttributes.addFlashAttribute("msg", "Enter keywords in the input field");

	        redirectview.setUrl("home");

	    }else {
	    String url ="https://www.google.com/search?q="+query;
	    redirectview.setUrl(url);
	    }
	    return redirectview;
	}
	

}
