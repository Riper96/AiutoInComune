package com.jaita120.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaita120.entities.Comune;
import com.jaita120.repository.ComuneRepository;

@Service
public class ComuneServiceImpl implements ComuneService{

	@Autowired
	private ComuneRepository repoCo;

	@Override
	public Comune findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
