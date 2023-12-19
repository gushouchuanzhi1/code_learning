package testday7;

public class Cat extends Animal{
    @Override
    public void eat(String something) {
        System.out.println("the cat is eating " + something);
    }

    public void catchMouse(){
        System.out.println("cat is catching mouse");
    }

    public Cat(int age, String color, String name) {
        super(age, color, name);
    }

    public Cat() {
    }
}
