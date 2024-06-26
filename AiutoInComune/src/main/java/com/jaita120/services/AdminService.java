package com.jaita120.services;

import com.jaita120.entities.Admin;

public interface AdminService {

	Admin findByID(Integer id) throws Exception;
	
	Admin save(Admin admin);
	
	void deleteById(Integer id)throws Exception;
	
	Admin updateById(Integer id,Admin admin)throws Exception;
	
	
}
