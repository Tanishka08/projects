package updateServer;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Entity
@Data


public class Customer
{
	
		@Id

		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String uId;
		@Column(name = "first_name")
		private String firstName;
		@Column(name = "last_name")
		private String lastName;
		private String email;
		public Customer(String firstName, String lastName, String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}

	}

