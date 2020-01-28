package hibernateWithServlet;
import hibernateWithServlet.CustomerDao;
import hibernateWithServlet.CustomerDaoImpl;
import hibernateWithServlet.Customer;
public class CustomerServiceImpl implements CustomerService
{
		private CustomerDao dao;
		{
			dao=new CustomerDaoImpl();
		}

		@Override
		public Customer createCustomer(Customer customer) 
		{
			
			return dao.createCustomer(customer);
		}

	}


