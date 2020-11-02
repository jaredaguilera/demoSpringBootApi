package com.demo.springboot.app.entity;

public class Poet {

	private String name;
	private String url;
	
	public Poet() {
	}
	
	public Poet(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "Poet [name=" + name + ", url=" + url + "]";
	}

}
