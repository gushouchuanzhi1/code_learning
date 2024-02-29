package day8.class2;

public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eating bugs");
    }

    @Override
    public void swim() {
        System.out.println("frog swimming");
    }
}
