package com.docker.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerSpringController {

	@GetMapping("/home")
	public String getHomePage() {
		return "This is my first Docker Spring boot image.";
	}
}
