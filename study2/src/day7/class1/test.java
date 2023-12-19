package day7.class1;

public class test {
    public static void main(String[] args) {
        Student s = new Student("zhangsna",17);
        Teacher t = new Teacher("lisi",29);
        s.show();t.show();

    }
    public static void printInfo(Person p){
        //父类类型 对象名称=子类对象 把这个参数写为这三个类型的父类
        p.show();
    }


}
