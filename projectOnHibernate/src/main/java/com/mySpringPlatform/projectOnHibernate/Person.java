package com.mySpringPlatform.projectOnHibernate;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.Data;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Person 
{
public Person(String string, String cName2) {
		// TODO Auto-generated constructor stub
	}
private int iD;
private String cName;
public void setDateOfBirth(LocalDate now) {
	// TODO Auto-generated method stub
	
}
}
