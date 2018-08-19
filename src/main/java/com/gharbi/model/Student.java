package com.gharbi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String yearlevel;
	
	public Student(){
		
	}
	
	public Student(int id, String firstname, String lastname, String yearlevel) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.yearlevel = yearlevel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getYearlevel() {
		return yearlevel;
	}
	public void setYearlevel(String yearlevel) {
		this.yearlevel = yearlevel;
	}
	
	
}
