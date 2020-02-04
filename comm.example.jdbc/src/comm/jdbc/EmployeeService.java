package comm.jdbc;
import java.util.List;
import java.sql.SQLException;
public interface EmployeeService 
{
	
		public List<Employee> getAllEmployees() throws SQLException;

	}
