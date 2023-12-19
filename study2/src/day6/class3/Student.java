package day6.class3;

public class Student extends Person{
    public Student(){
        super();
        System.out.println("this is Student 无参构造");
    }
    public Student(String name,int age){//字类使用了带参构造
        super(name,age);
    }

}
