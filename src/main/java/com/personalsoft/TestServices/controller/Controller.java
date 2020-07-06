package com.personalsoft.TestServices.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/{path}")
	public ResponseEntity<String> get(
			@PathVariable  String path,
			@RequestParam String request
			) {
		
		System.out.println(path);
		System.out.println(request);
		
		return ResponseEntity.ok(path.concat("").concat(request));
	}
	
	@PostMapping
	public String create() {
		return "Post working";
	 }
	
	@PutMapping
	public String update() {
		return "Post working";
	 }
	
	@DeleteMapping
	public String delete() {
		return "Post working";
	 }
}
