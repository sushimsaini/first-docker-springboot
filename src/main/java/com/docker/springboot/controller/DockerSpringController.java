package com.docker.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerSpringController {

	@GetMapping("/home")
	public String getHomePage() {
		java.util.UUID  UUID = java.util.UUID.randomUUID();
		return "This is my first Docker Spring boot image." + UUID.toString();
	}
}
