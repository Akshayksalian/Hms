package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.dao.AdminDAO;
import com.hms.entities.Admin;

/*
 * 
 */
@Service
//@Transactional(readOnly = true)
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO dao;

	@Override
	public Admin getAdminById(int id) {
		Admin admin = dao.getAdminById(id);
		return admin;
	}
	
	@Override
	public List<Admin> getAllAdmins() {
		return dao.getAllAdmins();
	}

}
