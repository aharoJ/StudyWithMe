package io.aharo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp 
{
    public static void main(String[] args) 
    {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrierve bean from srping container
        Coach coach = context.getBean("tennisCoach",TennisCoach.class);
        Coach alpaCoach = context.getBean("tennisCoach",TennisCoach.class);

        boolean res = ( coach == alpaCoach);

        System.out.println("\n Point to same object: " + res);
        System.out.println("\n Memory location for coach: " + coach);
        System.out.println(" Memory location for alpaCoach: " + alpaCoach + "\n");

        //close
        context.close();
        
    }
    
}
