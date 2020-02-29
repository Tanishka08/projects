package com.example.demo;

public class Movie {
	private Integer iD;
	private String name;
	private String synopsis;
	public Movie() {
	}
	public Movie(Integer iD, String name, String synopsis) {
		super();
		this.iD = iD;
		this.name = name;
		this.synopsis = synopsis;
	}
	public Integer getiD() {
		return iD;
	}

	public String getName() {
		return name;
	}
	
	public String getSynopsis() {
		return synopsis;
	}
	
	}


