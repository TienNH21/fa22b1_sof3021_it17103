package fa22b1.sof3021.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fa22b1.sof3021.beans.Register;
import fa22b1.sof3021.services.UserService;

@Controller
public class RegisterController {
	@Autowired
	private UserService userService;
	
	@Autowired
	@Qualifier("tiennh21")
	private Register r;
	
	@GetMapping("register/form")
	public String getRegisterForm(Model model)
	{
		this.userService.test();
		System.out.println(this.r.getHoTen());
		model.addAttribute("data", r);
		return "register";
	}
	
	@PostMapping("register")
	public String register(
		Model model,
		@Valid @ModelAttribute("data") Register r,
		BindingResult result
	) {
		System.out.println(r.getHoTen());
		if (result.hasErrors()) {
			System.out.println("Error");
		}
		return "register";
	}
}
