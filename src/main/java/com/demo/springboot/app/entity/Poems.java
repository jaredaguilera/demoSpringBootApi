package com.demo.springboot.app.entity;

public class Poems {

	private String title;
	private String content;
	private String url;
	private Poet poet;
	
	public Poems() {
	}
	
	public Poems(String title, String content, String url, Poet poet) {
		this.title = title;
		this.content = content;
		this.url = url;
		this.poet = poet;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Poet getPoet() {
		return poet;
	}
	public void setPoet(Poet poet) {
		this.poet = poet;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Poems [title=" + title + ", content=" + content + ", url=" + url + ", poet=" + poet + "]";
	}

}
