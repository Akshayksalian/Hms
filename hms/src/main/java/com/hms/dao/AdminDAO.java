package com.hms.dao;

import java.util.List;

import com.hms.entities.Admin;

/*
 * 
 */
public interface AdminDAO {

	Admin getAdminById(int id);

	List<Admin> getAllAdmins();

}
