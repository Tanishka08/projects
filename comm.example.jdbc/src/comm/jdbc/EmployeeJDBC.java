package comm.jdbc;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@ToString
public class EmployeeJDBC implements Serializable
{
	

		private static final long serialVersionUID = -375065079056659899L;
		private int customer_Id;
		private String first_Name;
		private String last_Name;
		private String email;
		public EmployeeJDBC(String first_Name, String last_Name, String email) {
			super();
			this.first_Name = first_Name;
			this.last_Name = last_Name;
			this.email = email;
		}
		
}
