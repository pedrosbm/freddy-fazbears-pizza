package com.psbm.fazbearentertainment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class FazbearentertainmentApplication {

	@GetMapping
	public ResponseEntity<String> test(){
		return ResponseEntity.ok("Freddy Fazbear's Pizza Working Clean!");
	}

	public static void main(String[] args) {
		SpringApplication.run(FazbearentertainmentApplication.class, args);
	}

}