package com.jaita120.services;

import com.jaita120.entities.Comune;

public interface ComuneService {

	Comune findById(Integer id);
	
	Comune findById(Comune comune);
}
