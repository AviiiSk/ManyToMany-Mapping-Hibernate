package com.manymap.example;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project_details")
public class Project {
	
	
	@Id
	@Column(name="p_Id")
	private int pId;
	
	@Column(name="project_Name")
	private String projectName;
	
	@ManyToMany(mappedBy = "projects")
	private List<Emp> emps;
	
	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public Project(int pId, String projectName, List<Emp> emps) {
		super();
		this.pId = pId;
		this.projectName = projectName;
		this.emps = emps;
	}

	public Project() {
		super();
		
	}

	 
        	
	
	
	

}
