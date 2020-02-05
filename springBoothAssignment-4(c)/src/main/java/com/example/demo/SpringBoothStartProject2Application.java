package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.CommandLinePropertySource;

import com.example.demo.dao.BookDao;

@SpringBootApplication
public class SpringBoothStartProject2Application 
{
	/*
private BookDao bookDao;
	
@Autowired
public SpringBoothStartProject2Application(BookDao bookDao)
{
	super();
	this.bookDao = bookDao;
}
*/
public static void main(String[] args) {
	SpringApplication.run(SpringBoothStartProject2Application.class, args);
}
/*
public void run(String... args) throws Exception
{
	
	bookDao.save(new Book("As You Like It","Author-1"));
	bookDao.save(new Book("Tresure Trove","Author-2"));
	bookDao.save(new Book("Nancy Drew","Author-3"));
	bookDao.save(new Book("Short Shories","Author-4"));
	bookDao.save(new Book("Finding Detective","Author-5"));
	bookDao.save(new Book("Invinsible","Author-6"));

}
*/
}

