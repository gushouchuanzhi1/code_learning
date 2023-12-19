package day6.class3;

public class ExampleStudent {//我希望这里可以默认这个学生的学校比如为华科
    int age;
    String name;
    String school;
    public ExampleStudent(){
        //类似于在调用super的时候，使用super来给对象赋值。
        this(0,null,"华科");
        System.out.println("学生的默认学校为华科");
    }

    public ExampleStudent(int age, String name, String school) {
        this.age = age;
        this.name = name;
        this.school = school;
    }
}
