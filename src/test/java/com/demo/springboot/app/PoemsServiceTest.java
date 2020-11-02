package com.demo.springboot.app;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.springboot.app.entity.Poems;
import com.demo.springboot.app.entity.Poet;
import com.demo.springboot.app.service.PoemsService;


public class PoemsServiceTest {
	
	@Autowired
	private PoemsService poemsService = Mockito.mock(PoemsService.class);
	
	@BeforeEach
	public void setup(){
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
    public void getPoemsList() {
		List<Poems> poemsList = new ArrayList<Poems>();
		poemsList = poemsService.findPoems();
		Assertions.assertEquals("pablo neruda", poemsList.get(0).getPoet().getName());
    }
}
