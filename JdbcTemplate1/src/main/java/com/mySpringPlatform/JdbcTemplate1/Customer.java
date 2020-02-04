package com.mySpringPlatform.JdbcTemplate1;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lonbok.Setter;
import lombok.Getter;
import org.springframework.stereotype.Component;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class Customer
{
	 {
			private String uid;
			private String firstName;
			private String lastName;
			private String email;
			public Customer(String firstName, String lastName, String email) {
				super();
				this.firstName = firstName;
				this.lastName = lastName;
				this.email = email;
			}
			@Override
			public String toString() {
				return String.format("%-20s%-20s%-20s%-20s\n", uid,firstName,lastName,email);
			}


		}
}
