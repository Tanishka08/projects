package com.example.demo.Error;
@SuppressWarnings("Serial")
public class BookNotFoundException extends RuntimeException
{
private String message;

public BookNotFoundException()  {
	super();

}
public BookNotFoundException(String message)
{
	super();
	this.message=message;
}
	public String getMessage()
	{
		return message;
	}
}

