package com.demo.springboot.app.entity;

import java.time.LocalDate;

public class PersonRQ {
	
	private String firstName;
	private String secondName;
	private String surname;
	private String secondSurname;
	private LocalDate birthDate;
	
	public PersonRQ() {
	}

	public PersonRQ(String firstName, String secondName, String surname, String secondSurname, LocalDate birthDate) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.surname = surname;
		this.secondSurname = secondSurname;
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "PersonRQ [firstName=" + firstName + ", secondName=" + secondName + ", surname=" + surname
				+ ", secondSurname=" + secondSurname + ", birthDate=" + birthDate + "]";
	}
	
}