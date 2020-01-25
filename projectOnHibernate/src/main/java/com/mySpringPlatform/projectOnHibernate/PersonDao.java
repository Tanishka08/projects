package com.mySpringPlatform.projectOnHibernate;
import java.io.IOException;
import java.util.List;
import com.mySpringPlatform.projectOnHibernate.Person1;
public interface PersonDao
{
	 

			public Person createPerson(Person person);
			public List<Person> getAllPersons();
			public Person getPersonByid(Integer id);
			public Person updatePerson(Integer id) throws IOException;
			public void deletePerson(Integer id);

		}

