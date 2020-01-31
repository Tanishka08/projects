package updateServer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService
{
	
		private CustomerDao dao;
		{
			dao=new CustomerDaoImpl();
		}

		@Override
		public Customer createCustomer(Customer customer) {
			
			return dao.createCustomer(customer);
		}

	
		public List<Customer> getAllCustomer() {
			// TODO Auto-generated method stub
			return dao.getAllCustomer();
		}

		@Override
		public Customer findBuyId(int id) {
			// TODO Auto-generated method stub
			return dao.findBuyId(id);
		}

		@Override
		public void update(Customer customer) {
			dao.update(customer);
			
		}

		@Override
		public void delete(Customer customer) {
			dao.delete(customer);
			
		}

	}

