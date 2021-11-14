package com.relevel.backend.sodexo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SodexoController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

