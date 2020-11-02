package com.demo.springboot.app.service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.app.entity.PersonRQ;
import com.demo.springboot.app.entity.PersonRS;
import com.demo.springboot.app.entity.Poems;
import com.demo.springboot.app.exceptions.PersonException;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PoemsService poemsService;

	@Override
	public PersonRS getInfoPerson(PersonRQ person) {
		Period edad = Period.between(person.getBirthDate(), LocalDate.now());
		
		LocalDate today = LocalDate.now();
		LocalDate nextBDay = person.getBirthDate().withYear(today.getYear());
		if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
            nextBDay = nextBDay.plusYears(1);
        }
		
		long numberOFDays = ChronoUnit.DAYS.between(today,nextBDay);
		
		PersonRS personRs = new PersonRS();
		personRs.setFirstName(person.getFirstName());
		personRs.setSurname(person.getSurname());   
	    personRs.setAge(edad.getYears());
	    
		if (person.getBirthDate().getMonthValue() == LocalDate.now().getMonthValue() && 
		    person.getBirthDate().getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
			List<Poems> poems = poemsService.findPoems();
			
			try {
				Random random = SecureRandom.getInstanceStrong();
				Poems poemsRandom = poems.get(random.nextInt(poems.size()));    	 
				personRs.setPoems(poemsRandom);
			} catch (NoSuchAlgorithmException e) {
				throw new PersonException(e.getMessage());
			}
			
			
		 }else {    
            personRs.setDayForHisBirthday(numberOFDays);		
		 }
		
		return personRs;
	}
}
