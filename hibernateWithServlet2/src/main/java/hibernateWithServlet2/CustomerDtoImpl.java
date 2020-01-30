package hibernateWithServlet2;

import org.mapstruct.Mapper;

@Mapper
public interface CustomerDtoImpl 
{


			public Customer customerDtoToCustomer(CustomerDto dto);
			public CustomerDto customerToCustomerDto(Customer customer);
		}


