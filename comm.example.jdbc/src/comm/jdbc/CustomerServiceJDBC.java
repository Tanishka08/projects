package comm.jdbc;
import java.sql.SQLException;

public interface CustomerServiceJDBC 
{
public CustomerJDBC createCuastomer(String last_Name,String first_Name,String email) throws SQLException;
	}

