package day6.class1;
/**静态方法只能访问静态变量，并且规定了this当前调用方法者的地址值
 * */
public class Student {
    private String name;
    private int age;
    static String teachername;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setTeachername(String teachername) {
        Student.teachername = teachername;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static String getTeachername() {
        return teachername;
    }
}
