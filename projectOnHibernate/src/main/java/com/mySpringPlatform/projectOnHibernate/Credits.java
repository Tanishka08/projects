package com.mySpringPlatform.projectOnHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Credits
{
public static void main(String args[])
{
	
			try {
				
				SessionFactory factory=new Configuration()
						.configure("hibernate.cfg.xml").addAnnotatedClass(Album.class)
						.addAnnotatedClass(MyImage.class).buildSessionFactory();
				Session session=factory.openSession();
				Album a=new Album("100","image.jpg");
				a.setMyImage(new MyImage("200", a));
				session.getTransaction().begin();
				session.save(a);
				session.getTransaction().commit();
				
			} 
			catch (Exception e)
			{
             e.printStackTrace();
             }
}
}
	
