package io.aharo.springdemo;

public class BaseballCoach implements Coach
{
    // define private field for dependency
    private FortuneService fortuneService;

    // define contructor for dependency injectiopn
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getDailyWorkout()
    {
        return "Spend 30 min on batting practice";
    
    }

    // dependency ~> helper 
    @Override
    public String getDailyFortune() 
    {
        // use my fortuneServiceto get a fortune
        //return "baseball Fortune";
        return fortuneService.getFortune();

    }

    
}
