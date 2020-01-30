package hibernateWithServlet2;

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

		@Override
		public List<Customer> getAllCustomer() {
			// TODO Auto-generated method stub
			return dao.getAllCustomer();
		}

	}

