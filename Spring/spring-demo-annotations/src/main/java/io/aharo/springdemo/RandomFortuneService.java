package io.aharo.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService
{
    // create an array of Strings
    private String[] data = 
    {
        "Beware of the wolf in sheep's clothing",
        "The journey is the reward",
        "Live life"
    };

    // create a random num gen
    private Random random = new Random();


    @Override
    public String getFortune() {
        // pick a ran Str from the arr
        int index = random.nextInt(data.length);
        String fortune = data[index];
        return fortune;
    }
    
}
