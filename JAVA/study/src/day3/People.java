package day3;

public class People {
    /**一个标准的javabean类
     * 成员变量需要使用private来修饰
     * 提供至少两个构造方法，无参构造和带全部参数的构造
     * 成员方法每个都有set和get方法*/
    //成员变量
    private String name;
    private int age;
    private String gender;
    //get和set方法
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //带全部参数的构造方法
    public People(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}


