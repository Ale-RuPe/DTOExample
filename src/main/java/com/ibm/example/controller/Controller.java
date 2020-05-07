package com.ibm.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.example.model.AnimalDTO;
import com.ibm.example.service.DTOService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Controller {
	@Autowired
	DTOService service;
	
	@GetMapping("/api/animal/{nombre}")
	public ResponseEntity<AnimalDTO> getAnimal(@PathVariable String nombre){
		
		log.info("Request param: {}", nombre);
		AnimalDTO  response = service.findAnimal(nombre);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}
