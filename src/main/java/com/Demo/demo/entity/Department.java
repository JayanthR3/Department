package com.Demo.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

@Entity
public class Department {

	@Id
	//@GeneratedValue(strategy= GenerationType.AUTO)
	private long departmentId;
	@NotBlank(message="please add department name")
	@Length(max=5,min=1)
	@Size(max=10,min=0)
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
	
	public Department(long departmentId, String departmentName, String departmentAddress, String departmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	 public Department() {
		 
	 }
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
	}
	 
	
}
