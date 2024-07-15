package spring1.spring_introduction.code2;

public class Cat2 implements Pet2 {
    public Cat2() {
        System.out.println("Cat bean is created");
    }


    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
