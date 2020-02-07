package com.mySpringPlatform.Fortune1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mySpringPlatform.Fortune1.Coach;
public class App 
{
public static void main(String args[])
{
	try
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach=context.getBean("theCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}
	catch(Exception e)
	{
		e.printStackTrace();
}
}
}

