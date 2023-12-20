package day8.class1;

public class Student extends Person{
    @Override
    public void work() {
        System.out.println("student is study");
    }

    public Student() {
    }

    public Student(int age, String name) {
        super(age, name);
    }
}
