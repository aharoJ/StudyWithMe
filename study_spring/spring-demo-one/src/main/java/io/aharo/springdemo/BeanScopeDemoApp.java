package io.aharo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BeanScopeDemoApp 
{
    public static void main(String[] args) 
    {

        // load the spring coinfig file
        ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");        // our config file "beanScope-applicationContext.xml"
        


        // retrive bean from spring container 
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());


        //check if they are the same
        boolean res = (theCoach == alphaCoach);


        System.out.println("\n pointing to the same obj: " + res);
        
        System.out.println("\n Memory location for theCoach: " + theCoach);

        System.out.println("\n Memory location for alphaCoach: " + alphaCoach + "\n");

        context.close();
    }
    
}
