package comm.jdbc;
import java.sql.SQLException;

public class CustomerServiceImplJDBC implements CustomerServiceJDBC
{
	
			private CustomerDaoJDBC dao;
			{
				dao=new CustomerDaoImplJDBC();
			}

			@Override
			public EmployeeJDBC createCuastomer(String last_Name, String first_Name, String email) throws SQLException {
				// TODO Auto-generated method stub
				return dao.createCuastomer(last_Name, first_Name, email);
			}

}
