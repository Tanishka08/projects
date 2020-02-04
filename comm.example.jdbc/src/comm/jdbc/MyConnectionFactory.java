package comm.jdbc;
import java.io.IOException;
import java.sql.Connection;
import java.io.InputStream;
import java.util.Properties;
import java.sql.DriverManager;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.io.FileInputStream;
public class MyConnectionFactory
{
	private Connection connection;
	private static MyConnectionFactory factory;

	public MyConnectionFactory() {
		super();
	}

	public static MyConnectionFactory getFactoryObject()
	{
		if(factory==null)
		{
			factory=new MyConnectionFactory();
		}
		return factory;
	}
	
	public Connection getMyConnection() throws IOException, SQLException
	{
		InputStream in=new FileInputStream("h2.properties");
		Properties prop=new Properties();
		prop.load(in);
		connection=DriverManager.getConnection(prop.getProperty("connection.url"),prop.getProperty("connection.user"),prop.getProperty("connection.password"));
		return connection;
	}
}
