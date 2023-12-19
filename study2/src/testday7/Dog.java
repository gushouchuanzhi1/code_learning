package testday7;

public class Dog extends Animal{
    @Override
    public void eat(String something) {
        System.out.println("the dog " + this.getName() + "is eating " + something);
    }
    public void lookHome(){
        System.out.println("the dog " + this.getName() + " is looking home");
    }

    public Dog() {
    }

    public Dog(int age, String color, String name) {
        super(age, color, name);
    }
}
