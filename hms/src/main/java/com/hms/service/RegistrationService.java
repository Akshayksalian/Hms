package com.hms.service;

import java.util.List;

import com.hms.entities.Admin;

public interface RegistrationService {

	public abstract List<Admin> findAllAdmin();

	public abstract void addAdmin(Admin admin);
	
	public abstract String checkAdmin(Admin admin);

}