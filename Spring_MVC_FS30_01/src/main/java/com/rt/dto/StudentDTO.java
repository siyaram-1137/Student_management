package com.rt.dto;

public class StudentDTO {
	
	private int id;
	private String name;
	private String mobile;
	private String address;
	
	public StudentDTO() {}
	
	public StudentDTO(int id, String name, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	
	public StudentDTO(String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
