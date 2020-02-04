package comm.jdbc;
import java.util.List;
import java.sql.SQLException;

public interface EmployeeDao 
{
 public List<Employee> getAllEmployees()throws SQLException; 	

}
