package com.mySpringPlatform.projectOnHibernate;
import java.io.IOException;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.mySpringPlatform.projectOnHibernate.Person1;
public class PersonServiceImpl implements PersonService
{
	private PersonDao dao;

{
	dao=new PersonDaoImpl();
}
@Override
public Person createPerson(Person person) {

	return dao.createPerson(person);
}

@Override
public List<Person> getAllPersons() {

	return dao.getAllPersons();
}

@Override
public Person getPersonByid(Integer id) {
	
	return dao.getPersonByid(id);
}

@Override
public Person updatePerson(Integer id) throws IOException {

	return dao.updatePerson(id);
}
@Override
public void deletePerson(Integer id) 
{
	dao.deletePerson(id);

}
}