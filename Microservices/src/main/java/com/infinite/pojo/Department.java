package com.infinite.pojo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Department { // products pojo

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentid;
	private String departmentname;
	private String departmentAddress;
	private String departmentCode;
	public Long getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	/*
	 * public Department(Long departmentid, String departmentname, String
	 * departmentAddress, String departmentCode) { super(); this.departmentid =
	 * departmentid; this.departmentname = departmentname; this.departmentAddress =
	 * departmentAddress; this.departmentCode = departmentCode; } public
	 * Department() { super(); // TODO Auto-generated constructor stub }
	 * 
	 */

}
