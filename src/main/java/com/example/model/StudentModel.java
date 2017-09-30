package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel
{
    private String npm;
    private String name;
    private double gpa;
    
    public StudentModel(String npm, String name, double gpa) {
		this.name = name;
		this.npm = npm;
		this.gpa = gpa;
	}
	
    public StudentModel() {
    	
    }
    
	public String getName() {
		return name;
	}
	
	public String getNpm() {
		return npm;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNpm(String npm) {
		this.npm = npm;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
