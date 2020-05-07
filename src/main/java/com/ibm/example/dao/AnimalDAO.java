package com.ibm.example.dao;

import com.ibm.example.model.AnimalModel;

public interface AnimalDAO {
	AnimalModel findAnimalByName(String name);
}
