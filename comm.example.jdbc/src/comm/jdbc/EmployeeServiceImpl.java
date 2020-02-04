package comm.jdbc;
import java.util.List;
import java.sql.SQLException;


public class EmployeeServiceImpl implements EmployeeService
{
private EmployeeDao dao;
	
	{
		dao=new EmployeeDaoImpl();
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}
}


