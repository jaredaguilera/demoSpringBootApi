package com.demo.springboot.app.entity;

public class PersonRS {

	private String firstName;
	private String surname;
	private int age;
	private long dayForHisBirthday;
	private Poems poems;
	
	public PersonRS() {
	}

	public PersonRS(String firstName, String surname, int age, long dayForHisBirthday, Poems poems) {
		this.firstName = firstName;
		this.surname = surname;
		this.age = age;
		this.dayForHisBirthday = dayForHisBirthday;
		this.poems = poems;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getDayForHisBirthday() {
		return dayForHisBirthday;
	}

	public void setDayForHisBirthday(long dayForHisBirthday) {
		this.dayForHisBirthday = dayForHisBirthday;
	}

	public Poems getPoems() {
		return poems;
	}

	public void setPoems(Poems poems) {
		this.poems = poems;
	}
	
	@Override
	public String toString() {
		return "PersonRS [firstName=" + firstName + ", surname=" + surname + ", age=" + age + ", dayForHisBirthday="
				+ dayForHisBirthday + ", poems=" + poems + "]";
	}

}