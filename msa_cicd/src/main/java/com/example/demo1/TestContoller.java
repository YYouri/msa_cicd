package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {

	@GetMapping("/test")
	public String getTest() {
		return "11";
	}
}
