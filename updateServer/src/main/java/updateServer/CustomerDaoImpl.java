package updateServer;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;

public class CustomerDaoImpl implements CustomerDao {

	private Session session;
	private EntityManager entityManager;

	{
		session=CustomerUtil.getMySessionFactory().openSession();
		
		session.getTransaction().begin();
		entityManager=session.
				getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
	}

	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		return customer;
	}

	public List<Customer> getAllCustomer() {
		Query query=entityManager.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}

	
	public Customer findBuyId(int id) {
		entityManager.getTransaction().begin();
		Customer c=entityManager.find(Customer.class, id);
		entityManager.getTransaction().commit();
		return c;
		
		
	}

	
	public void update(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.merge(customer);
		entityManager.getTransaction().commit();
		
	}

	
	public void delete(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.remove(customer);
		entityManager.getTransaction().commit();
		
	}

}

