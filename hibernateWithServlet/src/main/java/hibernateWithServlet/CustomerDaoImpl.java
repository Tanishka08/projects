package hibernateWithServlet;
import javax.persistence.EntityManager;

import com.mysql.cj.Session;
public class CustomerDaoImpl implements CustomerDao
{
		private org.hibernate.Session session;
			private EntityManager entityManager;
			
			{
				session=CustomerUtil.getMySessionFactory().openSession();
				session.getTransaction().begin();
				entityManager=((EntityManager) session).
						getEntityManagerFactory().createEntityManager();
				session.getTransaction().commit();
			}

			@Override
			public Customer createCustomer(Customer customer) {
				entityManager.getTransaction().begin();
				entityManager.persist(customer);
				entityManager.getTransaction().commit();
				return customer;
			}

	}


