package spring1.spring_introduction.code2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig2 {
    @Bean
    @Scope("singleton")
    public Pet2 cat2Bean() {
        System.out.println("catBean!!!!!!!!!!!!!!!");
        return new Cat2();
    }

    @Bean
    public Person2 person2Ben() {
        return new Person2(cat2Bean());
    }
}
