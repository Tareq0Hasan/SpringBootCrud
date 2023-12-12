package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("ovi")
public class HomeController {
	@Autowired
	private final UserRepository userRepository;
	@Autowired
	UserService userservice;
	


	public HomeController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("User", userservice.getUserl());
		return "Home";
	}

	@GetMapping("/homee")
	public String userl() {

		userservice.getUserl();
		return "Home";
	}
	 

}
