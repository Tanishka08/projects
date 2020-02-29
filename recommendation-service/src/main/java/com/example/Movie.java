package com.example;

public class Movie {
private Integer iD;
private String name;
private String synopsis;
public Movie()
{
	
}
public Integer getiD() {
	return iD;
}
public void setiD(Integer iD) {
	this.iD = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSynopsis() {
	return synopsis;
}
public void setSynopsis(String synopsis) {
	this.synopsis = synopsis;
}
public Movie(Integer iD, String name, String synopsis) {
	super();
	this.iD = iD;
	this.name = name;
	this.synopsis = synopsis;
}

}
