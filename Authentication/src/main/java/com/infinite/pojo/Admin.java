package com.infinite.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	@GeneratedValue
	private Long admin_Id;
	private String adminname;
	private String adminpassword;

	public Long getAdmin_Id() {
		return admin_Id;
	}

	public void setAdmin_Id(Long admin_Id) {
		this.admin_Id = admin_Id;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

}
