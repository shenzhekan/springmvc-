package com.szk.vo;

import org.springframework.stereotype.Component;

@Component("role")
public class Role {

	private Long id;
	private String role_name;
	private String note;
	
	public Role() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	

	
	
}
