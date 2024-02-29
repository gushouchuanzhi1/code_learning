package day8.class2;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Dog d = (Dog) a1;
        d.swim();d.eat();
        Frog f = new Frog();
        f.swim();f.eat();
        Rabbit r = new Rabbit();
        r.eat();


    }


}
