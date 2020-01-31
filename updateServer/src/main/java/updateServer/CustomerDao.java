package updateServer;

import java.util.List;

public interface CustomerDao
{
	 

			public Customer createCustomer(Customer customer);
			public List<Customer> getAllCustomer();
			
			public Customer findBuyId(int id);
			
			public void update(Customer customer);
			public void delete(Customer customer);
		}

