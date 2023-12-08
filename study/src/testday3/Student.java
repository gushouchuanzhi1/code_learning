package testday3;
/**定义-一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
 * 学生的属性:学号,姓名，年龄。
 * 要求1:再次添加一一个学生对象，并在添加的时候进行学号的唯一性判断。
 * 要求2:添加完毕之后，遍历所有学生信息。
 * 要求3:通过id删除学生信息
 * 如果存在，则删除，如果不存在,则提示删除失败。
 * 要求4:删除完毕之后，遍历所有学生信息。
 * 要求5:查询数组id为"heima002”的学生,如果存在,则将他的年龄+1岁*/
public class Student {
    private String sid;
    private String name;
    private int age;

    public Student(){

    }
    public Student(String sid, String name, int age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
