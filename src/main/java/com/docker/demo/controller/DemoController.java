package com.docker.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {
	
	@GetMapping
	public String checkMethod() {
		return "Working";
	}
	@GetMapping
	public String deploymentCheck() {
		return "Edited Code Deployed";
	}
}
