package com.docker.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.demo.Service.DemoService;


@RestController
@RequestMapping("demo")
public class DemoController {
	@Autowired
	DemoService demoService;
	
	@GetMapping
	public String checkMethod() {
		return "Working";
	}
	@GetMapping("/edit")
	public String deploymentCheck() {
		return "Edited Code Deployed";
	}
	@GetMapping("/input/{name}")
	public String firstInput(@PathVariable String name) {
		return demoService.demoFirstService(name);
	}
	@GetMapping("/param")
	public String secInput(@RequestParam String name) {
		return demoService.demoFirstService(name);
	}
	
}
