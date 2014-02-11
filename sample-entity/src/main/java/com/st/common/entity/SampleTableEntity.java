package com.st.common.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "Sample_Table")
public class SampleTableEntity extends BaseEntity {

		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String name;
	@Column
	private String phoneNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
	
}
