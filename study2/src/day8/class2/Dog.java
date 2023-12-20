package day8.class2;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eating bones");
    }

    @Override
    public void swim() {
        System.out.println("dog swimming");
    }
}
