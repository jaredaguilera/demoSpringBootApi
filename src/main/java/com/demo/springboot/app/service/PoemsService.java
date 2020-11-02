package com.demo.springboot.app.service;

import java.util.List;

import com.demo.springboot.app.entity.Poems;

public interface PoemsService {

	public List<Poems> findPoems();

}
