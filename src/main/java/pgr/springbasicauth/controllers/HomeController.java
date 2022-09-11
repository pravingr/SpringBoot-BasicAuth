package pgr.springbasicauth.controllers;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path = "/" )
public class HomeController {
	
	
	@GetMapping
	public String message(Principal principal) {
		return "Hi " + principal.getName() + "!";
	}
	
}
