package com.mySpringPlatform.projectOnHibernate;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data


public class Person1 
{
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iD;
	private String uId;
	@Column(name = "name")
	private String cName;
	@Column(name = "dob")
	private LocalDate dateOfBirth;
	public Person1(String uId, String cName, LocalDate dateOfBirth)
	{
		super();
		this.uId = uId;
		this.cName = cName;
		this.dateOfBirth = dateOfBirth;
	}

	

}


