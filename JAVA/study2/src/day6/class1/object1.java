package day6.class1;


/**本章开始是面向对象进阶部分，会学习：
 * static、继承、包、final、权限修饰符、代码块
 * 抽象类、接口、多态、内部类
 * 本文件中学习static、继承*/
public class object1 {
    //使用Student.java
    public static void main(String[] args) {
        //在对象里设置静态成员，相当于这个成员被所有的对象共享。
        Student s1 = new Student("john",1);
        s1.setTeachername("tom");
        Student s2 = new Student();
        System.out.println(s2.teachername);//直接使用类名调用
    }
}
