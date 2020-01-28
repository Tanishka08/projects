package hibernateWithServlet;
import org.mapstruct.Mapper;
@Mapper
public interface CustomerDtoImpl 
{
	

		public Customer customerDtoToCustomer(CustomerDto dto);
	}

