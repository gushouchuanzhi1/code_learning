package day7.class2;

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        if(a instanceof Dog){//强制转换
            Dog d = (Dog) a;
        }else if (a instanceof Cat){
            Cat c = (Cat) a;
        }

    }

}

class Animal{
    private int age;
    private String name;
    public void eat(){
        System.out.println("animal is eating");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("dog is eating");
    }
    public void dogWork(){
        System.out.println("dog is watching");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("Cat is eating");
    }
    public void catWork(){
        System.out.println("Cat is catching");
    }
}