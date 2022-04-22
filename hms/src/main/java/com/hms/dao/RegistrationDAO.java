package com.hms.dao;

import java.util.List;

import com.hms.entities.Admin;

public interface RegistrationDAO {

	public abstract List<Admin> findAllAdmin();

	public abstract void addAdmin(Admin admin);

}