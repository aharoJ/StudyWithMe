package io.aharo.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

@Component
public class TennisCoach implements Coach 
{
	@Qualifier("randomFortuneService")
	@Autowired private FortuneService fortuneService;
	
	
	//dvc
	TennisCoach(){System.out.println("««DVC««");}

	// init func
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("TennisCoach: @postContructt");
	}

	// destroy func
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println("TennisCoach: @destroyConstruct");

	}




	/* 
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService)
	{
		System.out.println("««func:doSomeCrazyStuff««");
		this.fortuneService = fortuneService;
	}
	*/


	/* 
	// setterMethod
	@Autowired
	public void seFortuneService(FortuneService fortuneService)
	{
		System.out.println("««setFortune««");
		this.fortuneService = fortuneService;
	}
	*/

	/* 
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "«Practice your backhand volley«";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
