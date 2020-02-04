package comm.jdbc;
import java.util.Scanner;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Employee implements Serializable
{
/**
 * 
	 */
	private static final long serialVersionUID = -4416560965054133058L;
private String first_name;
private String last_name;
private String employee_id;
private double salary;
}


