package com.gokhantamkoc.javabootcamp.swapperconsole.model;

import java.util.List;

// Ürün Sahibi
public class Owner {
	private int id;
	private String name;
	private String surname;
	private int birthDate;
		
	public Owner(int id, String name, String surname, int birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}	
}
