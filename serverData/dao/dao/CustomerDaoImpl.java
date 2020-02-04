package ServerData.dao;
import javax.persistence.EntityManager;
import ServerData.model.Customer;
import ServerData.util.CustomerUtil;
public class CustomerDaoImpl
{
	private Session session;
		private EntityManager entityManager;
		
		{
			session=CustomerUtil.getMySessionFactory().openSession();
			session.getTransaction().begin();
			entityManager=session.
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

