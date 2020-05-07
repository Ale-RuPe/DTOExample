package com.ibm.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.example.dao.AnimalDAO;
import com.ibm.example.dao.MascotaPerdidaDAO;
import com.ibm.example.model.AnimalDTO;
import com.ibm.example.model.AnimalModel;
import com.ibm.example.model.MascotaPerdidaModel;
import com.ibm.example.service.BuilderService;
import com.ibm.example.service.DTOService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DTOServiceImpl implements DTOService{
	@Autowired
	AnimalDAO animalDAO;
	
	@Autowired
	MascotaPerdidaDAO mascotaDAO;
	
	@Autowired
	BuilderService comparator;
	
	@Override
	public AnimalDTO findAnimal(String name) {
		
		AnimalModel animal = animalDAO.findAnimalByName(name);
		log.info("animal found: {}", animal);
		
		MascotaPerdidaModel mascota =  mascotaDAO.findMascotaByName(name);
		log.info("mascota found: {}", mascota);
		
		AnimalDTO response = comparator.buildDTO(animal, mascota);
		
		return response;
	}

}
