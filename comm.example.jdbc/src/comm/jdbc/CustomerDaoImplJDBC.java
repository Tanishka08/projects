package comm.jdbc;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class CustomerDaoImplJDBC implements CustomerDaoJDBC
{

			private MyConnectionFactory factory=null;
			private Connection connection=null;
			PreparedStatement pStatement=null;
			private CustomerJDBC customer=null;
			{
				factory=MyConnectionFactory.getFactoryObject();
				try {
					connection=factory.getMyConnection();
				} catch (IOException | SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			public EmployeeJDBC createCuastomer(String last_Name, String first_Name, String email) throws SQLException {
				customer=new EmployeeJDBC(last_Name, first_Name, email);
				pStatement=connection.prepareStatement("insert into "
						+ "customer(last_name,first_name,email) "
						+ "values(?,?,?)");
				pStatement.setString(1, customer.getLast_Name());
				pStatement.setString(2, customer.getFirst_Name());
				pStatement.setString(3, customer.getEmail());
				pStatement.executeUpdate();
				return customer;
			}

		}

