package com.ibm.registration.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enroll implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
	private String rollnbr;
	private String appnbr;
    private String name;
    private String age;
    private String gender;
    private String father;
    private String mother;    
    private String address;
    private String grade;
    private String entrtest;
    
    public Enroll() {
        super();
    }

	public Enroll(Long id, String appnbr, String name, String age, String gender, String father, String mother,
			String address, String grade, String entrtest) {
		super();
		this.id = id;
		this.appnbr = appnbr;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.father = father;
		this.mother = mother;
		this.address = address;
		this.grade = grade;
		this.entrtest = entrtest;
	}
	
	public Long getId() {
        return id;
    }
	
	public String getAppnbr() {
		return appnbr;
	}

	public void setAppnbr(String appnbr) {
		this.appnbr = appnbr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getEntrtest() {
		return entrtest;
	}

	public void setEntrtest(String entrtest) {
		this.entrtest = entrtest;
	}

	public String getRollnbr() {
		return rollnbr;
	}

	public void setRollnbr(String rollnbr) {
		this.rollnbr = rollnbr;
	}   
    
}