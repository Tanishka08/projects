package updateServer;
import org.mapstruct.Mapper;
public interface CustomerDtoImpl {
	 

			public Customer customerDtoToCustomer(CustomerDto dto);
			public CustomerDto customerToCustomerDto(Customer customer);
		}


