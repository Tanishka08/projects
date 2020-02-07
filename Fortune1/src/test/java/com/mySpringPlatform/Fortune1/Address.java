package com.mySpringPlatform.Fortune1;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Address
{
private String addressLine1;
private String addressLine2;
private String phoneNumber;
private String zipCode;
@Override
public String toString() {
	return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", phoneNumber=" + phoneNumber
			+ ", zipCode=" + zipCode + "]";
}

}
