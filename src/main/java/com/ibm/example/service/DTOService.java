package com.ibm.example.service;

import com.ibm.example.model.AnimalDTO;

public interface DTOService {
	AnimalDTO findAnimal(String name);
}
