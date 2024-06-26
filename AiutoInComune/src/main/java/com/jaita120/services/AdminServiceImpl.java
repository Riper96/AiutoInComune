package com.jaita120.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaita120.entities.Admin;
import com.jaita120.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository repo;
	
	@Override
	public Admin findByID(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin save(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin updateById(Integer id, Admin admin) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
