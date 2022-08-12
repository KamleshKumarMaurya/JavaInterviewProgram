package com.collection;

public class Emp {
	private int EmpId;
	private String name;
	private String phone;
	
	public Emp(int empId, String name, String phone) {
		super();
		EmpId = empId;
		this.name = name;
		this.phone = phone;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Emp [EmpId=" + EmpId + ", name=" + name + ", phone=" + phone + "]";
	}

	
}
