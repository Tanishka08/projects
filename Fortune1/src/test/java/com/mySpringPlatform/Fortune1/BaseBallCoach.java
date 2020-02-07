package com.mySpringPlatform.Fortune1;
public class BaseBallCoach implements Coach
{
FortuneService fortuneService=null;
public BaseBallCoach(FortuneService fortuneService)
{
super();
this.fortuneService = fortuneService;
}
@Override
public String getDailyWorkout()
{
	return "Practice backball volleyBall Today";
}
public String getDailyFortune()
{
	return fortuneService.getDailyFortune();
}
}
