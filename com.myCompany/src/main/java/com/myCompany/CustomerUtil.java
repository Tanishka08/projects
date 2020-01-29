package com.myCompany;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustomerUtil
{
	

		public static SessionFactory getMySessionFactory()
		{
			return new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Customer.class)
					.buildSessionFactory();
		}

	}

