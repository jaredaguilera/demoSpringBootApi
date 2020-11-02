package com.demo.springboot.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.springboot.app.entity.Poems;
import com.demo.springboot.app.exceptions.PoemsException;

@Service
public class PoemsServiceImpl implements PoemsService {

	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Poems> findPoems() {
		List<Poems> poems = new ArrayList<Poems>();
		try {
			poems= Arrays.asList(clienteRest.getForObject("https://www.poemist.com/api/v1/randompoems", Poems[].class));
		} catch (Exception e) {
			throw new PoemsException(e.getMessage());
		}
		return poems;
	}
}
