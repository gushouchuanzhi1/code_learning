package day6.class3;

public class Person {
    String name;
    int age;
    public Person(){
        System.out.println("this is person 无参构造");

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
