package com.manymap.example;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Emp {
	
	
	@Id
	@Column(name = "e_Id")
	private int eId;
	
	@Column(name = "e_Name")
	private String eName;
	
	@ManyToMany
	private List<Project> projects;
	
	
	
	public int geteId() {
		return eId;
	}


	public void seteId(int eId) {
		this.eId = eId;
	}

	
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Emp(int eId, String eName, List<Project> projects) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.projects = projects;
	}

	public Emp() {
		super();
		
	}

	
	
	

}
