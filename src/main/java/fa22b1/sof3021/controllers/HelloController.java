package fa22b1.sof3021.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@GetMapping("hello")
	public String hello()
	{
		return "hello";
	}
	
	@GetMapping("demo-get")
	public String demoGetMapping(
		@RequestParam(
			name="ho_ten",
			defaultValue="FPT Polytechnic"
		) String name
	) {
		System.out.println(name);
		return "hello";
	}
	
	@PostMapping("demo-post")
	public String demoPostMapping(
		@RequestParam(
			name="ho_ten",
			defaultValue="FPT Polytechnic"
		) String name
	) {
		System.out.println(name);
		return "hello";
	}
}
