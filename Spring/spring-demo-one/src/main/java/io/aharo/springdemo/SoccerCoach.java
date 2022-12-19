package io.aharo.springdemo;

public class SoccerCoach implements Coach
{
    public String getDailyWorkout(){
        return "do 24 drills!";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return "soccer Fortune";
    }

    
    
}
