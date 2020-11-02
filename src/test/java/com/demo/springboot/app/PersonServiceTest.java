package com.demo.springboot.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.springboot.app.controllers.PersonController;
import com.demo.springboot.app.entity.PersonRQ;
import com.demo.springboot.app.entity.PersonRS;
import com.demo.springboot.app.entity.Poems;
import com.demo.springboot.app.entity.Poet;
import com.demo.springboot.app.service.PersonService;
import com.demo.springboot.app.service.PoemsService;

@RunWith( SpringRunner.class )
@SpringBootTest
public class PersonServiceTest {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private PoemsService poemsService = Mockito.mock(PoemsService.class);
	
    @Autowired
    PersonController personController = new PersonController();
	
	@BeforeEach
	public void setUp() {
		
		Poems poem = new Poems();
		Poet poet = new Poet();
		List<Poems> poemsList = new ArrayList<Poems>();
		
		poem.setTitle("Titulo");
		poem.setContent("Contenido Poema");
		poem.setUrl("www.poems.cl");
		poet.setName("pablo neruda");
		poet.setUrl("www.pabloneruda.cl");
		poem.setPoet(poet);
		poemsList.add(poem);
		Mockito.when(poemsService.findPoems()).thenReturn(poemsList);
	}
	
	@Test
	public void getInfoPersonBirthDay() {
		PersonRQ personRQ = new PersonRQ();
		personRQ.setFirstName("jared");
		personRQ.setSecondName("alberto");
		personRQ.setSurname("aguilera");
		personRQ.setSecondSurname("zamora");
		personRQ.setBirthDate(LocalDate.now());
		PersonRS personRS = personService.getInfoPerson(personRQ);
		Assertions.assertNotNull(personRS.getPoems());
	}
	
	@Test
	public void getInfoPersonBirthOtherDay() {
		PersonRQ personRQ = new PersonRQ();
		personRQ.setFirstName("jared");
		personRQ.setSecondName("alberto");
		personRQ.setSurname("aguilera");
		personRQ.setSecondSurname("zamora");
		personRQ.setBirthDate(LocalDate.of(1993,02,21));
		PersonRS personRS = personService.getInfoPerson(personRQ);
		Assertions.assertNotNull(personRS.getDayForHisBirthday());
	}
	
	@Test
	public void getInfoPersonBirthDayController() {
		PersonRQ personRQ = new PersonRQ();
		personRQ.setFirstName("jared");
		personRQ.setSecondName("alberto");
		personRQ.setSurname("aguilera");
		personRQ.setSecondSurname("zamora");
		personRQ.setBirthDate(LocalDate.now());
		ResponseEntity<PersonRS> personRS = personController.getInfoPerson(personRQ);
		Assertions.assertNotNull(personRS.getBody().getPoems());
	}
}
