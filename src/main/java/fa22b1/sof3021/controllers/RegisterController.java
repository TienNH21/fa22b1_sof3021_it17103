package fa22b1.sof3021.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fa22b1.sof3021.beans.Register;

@Controller
public class RegisterController {
	@GetMapping("register/form")
	public String getRegisterForm(Model model)
	{
		System.out.println(123123);
		Register r = new Register();
//		r.setHoTen("DungNA29");
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
