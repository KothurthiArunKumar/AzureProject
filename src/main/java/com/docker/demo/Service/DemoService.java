package com.docker.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	public String demoFirstService(String name) {
		return "Name given is -> "+name;
	}
}
