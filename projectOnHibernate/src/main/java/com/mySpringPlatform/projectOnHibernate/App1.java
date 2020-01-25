package com.mySpringPlatform.projectOnHibernate;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mySpringPlatform.projectOnHibernate.Person1;
import com.mySpringPlatform.projectOnHibernate.PersonService;
import com.mySpringPlatform.projectOnHibernate.PersonServiceImpl;
public class App1
{
private static PersonService service;
static
{
	service=new PersonServiceImpl();
}
public static void main(String args[])
{
Person p=service.getPersonByid(100);
	System.out.println(p);
}
}
