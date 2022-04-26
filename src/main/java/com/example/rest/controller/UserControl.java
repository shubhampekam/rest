package com.example.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControl {

	@RequestMapping("/")
	public String root() {
		return "works";
	}
}
