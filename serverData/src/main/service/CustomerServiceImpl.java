import SeverData.dao.CustomerDao;
import ServerData.dao.CustomerDaoImpl;
import ServerData.model.Customer;
public class CustomerServiceImpl
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

