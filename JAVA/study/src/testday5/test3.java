package testday5;

import java.util.ArrayList;
import java.util.Scanner;

/**添加学生对象并且进行遍历 使用ArrayList
 * 使用Student.java*/
public class test3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        insertStudents(students);
        printStudents(students);

    }
    public static ArrayList<Student> insertStudents(ArrayList<Student> students){//进行学生添加
        System.out.println("需要添加学生数量为：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            //每次循环一定要创建新的student对象，否则最后只会有一个留着
            Student student = new Student();
            System.out.println("该学生姓名为");
            String name = sc.next();
            student.setName(name);
            System.out.println(name);
            System.out.println("该学生年龄为");
            int age = sc.nextInt();
            student.setAge(age);
            students.add(student);
            System.out.println(age);
        }
        return students;
    }

    public static void printStudents(ArrayList<Student> students){
        //自定义的arraylist不支持
        for(int i = 0; i < students.size(); i++){
            System.out.println("这是第"+ (i+1) +"个学生，名字和年龄分别为" + students.get(i).getName() + " " + students.get(i).getAge());
        }

    }

}
