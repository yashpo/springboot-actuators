package com.sb.actuator;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {
	@GetMapping("/hello")
	public String example() {
		return "Hello !! ";
	}
}
