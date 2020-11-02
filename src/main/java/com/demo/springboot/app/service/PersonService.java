package com.demo.springboot.app.service;

import com.demo.springboot.app.entity.PersonRQ;
import com.demo.springboot.app.entity.PersonRS;

public interface PersonService {
	
	public PersonRS getInfoPerson(PersonRQ person);

}
