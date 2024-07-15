package spring1.spring_introduction.code2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class Person2 {
    private Pet2 pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person2(Pet2 pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
