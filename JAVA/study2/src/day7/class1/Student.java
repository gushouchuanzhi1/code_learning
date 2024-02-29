package day7.class1;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void show(){
        System.out.println("student name " + getName() + " student age " + getAge());
    }
}
