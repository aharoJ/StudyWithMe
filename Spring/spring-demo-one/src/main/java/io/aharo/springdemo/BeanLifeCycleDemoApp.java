package io.aharo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BeanLifeCycleDemoApp 
{
    public static void main(String[] args) 
    {

        // load the spring coinfig file
        ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");        // our config file "beanScope-applicationContext.xml"
        


        // retrive bean from spring container 
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout() + "\n\n");

       // close
        context.close();
    }
    
}
