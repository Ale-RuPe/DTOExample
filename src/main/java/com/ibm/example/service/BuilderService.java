package com.ibm.example.service;

import com.ibm.example.model.AnimalDTO;
import com.ibm.example.model.AnimalModel;
import com.ibm.example.model.MascotaPerdidaModel;

public interface BuilderService {
	AnimalDTO buildDTO(AnimalModel animal, MascotaPerdidaModel mascota);
}
