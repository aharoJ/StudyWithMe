package io.aharo.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ComponentScan("io.aharo.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig 
{
    // define bean for sadFortune
    @Bean
    public FortuneService sadFortuneService()
    {
        return new SadFortuneService();
    }

    // add support to resolve ${...} properties
    @Bean
    public static PropertySourcesPlaceholderConfigurer
                    propertySourcesPlaceHolderConfigurer() {
        
        return new PropertySourcesPlaceholderConfigurer();
    }


    // define bean for swimCoach and Inject Dependency
    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach(sadFortuneService());
    }

    
}
