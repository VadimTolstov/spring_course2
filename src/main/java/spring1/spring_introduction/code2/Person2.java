package spring1.spring_introduction.code2;

public class Person2 {
    private Pet2 pet;
    private String surname;
    private int age;

    public Person2(Pet2 pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
    }
}
