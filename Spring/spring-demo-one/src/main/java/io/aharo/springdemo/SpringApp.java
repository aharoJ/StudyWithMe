package io.aharo.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp 
{
    public static void main(String[] args) 
    {
        // load the spring config file
        ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrive a bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // function for Fortunes
        System.out.println("((" + theCoach.getDailyFortune());
        
        // close the context
        context.close();
        
    }
    
}
