package day8.class1;

public class Teacher extends Person{
    @Override
    public void work() {
        System.out.println("teacher is working");
    }

    public Teacher() {
    }

    public Teacher(int age, String name) {
        super(age, name);
    }
}
