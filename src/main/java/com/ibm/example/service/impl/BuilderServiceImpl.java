package com.ibm.example.service.impl;

import org.springframework.stereotype.Service;

import com.ibm.example.model.AnimalDTO;
import com.ibm.example.model.AnimalModel;
import com.ibm.example.model.MascotaPerdidaModel;
import com.ibm.example.service.BuilderService;

@Service
public class BuilderServiceImpl implements BuilderService{

	@Override
	public AnimalDTO buildDTO(AnimalModel animal, MascotaPerdidaModel mascota) {
		AnimalDTO dto = new AnimalDTO();
		
		dto.setNombre(animal.getNombre());
		dto.setRaza(animal.getRaza());
		dto.setTamanio(animal.getTamanio());
		dto.setColor(animal.getColor());
		dto.setEncontrado(mascota.getEncontrado());
		dto.setMensaje(mascota.getMensaje());
		
		return dto;
	}
}
