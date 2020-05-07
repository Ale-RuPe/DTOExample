package com.ibm.example.dao;

import com.ibm.example.model.MascotaPerdidaModel;

public interface MascotaPerdidaDAO {
	MascotaPerdidaModel findMascotaByName(String name);
}
