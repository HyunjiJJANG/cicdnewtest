package kr.co.jhta.springbootex22.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	
	@RequestMapping("/home")
	public String hello(Model model) {
		
		model.addAttribute("msg", "안녕하세요");
		
		return "home";
	}

}
