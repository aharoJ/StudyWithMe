package io.aharo.springdemo;

public class SadFortuneService implements FortuneService
{

    @Override
    public String getFortune() 
    {
        return "«today is a SAD day :( «";
    }
    
}
