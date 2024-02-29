package day7.class1;

public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void show(){
        System.out.println("teacher name " + getName() + " teacher age " + getAge());
    }
}
