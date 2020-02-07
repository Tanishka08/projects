package com.mySpringPlatform.Fortune1;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Employee
{
private String employeeId;
private String firstName;
private String lastName;
private Address address;
@Override
public String toString()
{
	return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}
}
