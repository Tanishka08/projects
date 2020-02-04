package comm.jdbc;
import java.util.List;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class EmployeeDaoImpl implements EmployeeDao

{
	private MySqlConnectionFactory facctory = null;
	private Connection connection = null;
	private Statement statement = null;
	List<Employee> list = null;

	{
		facctory = MySqlConnectionFactory.getMyConnectionObject();
		try {
			connection = facctory.getMyConnection();
			list = new ArrayList<Employee>();
		} catch (SQLException e) {

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {

		statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select employee_id,first_name,last_name,salary from employees");
		while (resultSet.next()) {

			list.add(new Employee(resultSet.getInt("employee_id"),
					resultSet.getString("first_name"),
					resultSet.getString("last_name"),
					resultSet.getDouble("salary")));

		}

		return list;
	}

}	
	
	


