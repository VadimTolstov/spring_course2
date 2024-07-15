package spring1.spring_introduction.code2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring1.spring_introduction.code1.Pet;

public class Test7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
//        Pet2 cat1 = context.getBean("cat2Bean", Cat2.class);
//        Pet2 cat2 = context.getBean("cat2Bean", Cat2.class);

        Person2 person2 = context.getBean(Person2.class);
        person2.callYourPet();
        System.out.println(person2.getAge());
        context.close();
    }
}
