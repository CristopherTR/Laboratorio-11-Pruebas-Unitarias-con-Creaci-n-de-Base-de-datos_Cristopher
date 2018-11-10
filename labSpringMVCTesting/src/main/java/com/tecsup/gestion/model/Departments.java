package com.tecsup.gestion.model;

public class Departments {

	int departmentId;
	String name;
	String description;
	String city;

	
	/**
	 * 
	 * @param login
	 * @param description
	 * @param city
	 */
	public Departments(String name, String description,String city) {
		super();
		this.name = name;
		this.description = description;
		this.city = city;
	}

	public Departments() {
		super();
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentID) {
		this.departmentId = departmentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Departments [ departmentId=" + departmentId + ", name="
				+ name + ", description=" + description + ", city=" + city + "]";
	}

}