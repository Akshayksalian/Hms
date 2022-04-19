package com.hms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * 
 */
@Entity
public class Technology_stack {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int technology_id;

	private String technology_name;

	public Technology_stack() {
		super();
	}

	public Technology_stack(int technology_id, String technology_name) {
		super();
		this.technology_id = technology_id;
		this.technology_name = technology_name;
	}

	public int getTechnology_id() {
		return technology_id;
	}

	public String getTechnology_name() {
		return technology_name;
	}

	public void setTechnology_name(String technology_name) {
		this.technology_name = technology_name;
	}

	@Override
	public String toString() {
		return "Technology_stack [technology_id=" + technology_id + ", technology_name=" + technology_name + "]";
	}

}