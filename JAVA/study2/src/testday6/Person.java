package testday6;

public class Person {
    private String name;
    private String wid;//工号

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;
    public void work(){
        System.out.println("is working");
    }
    public void eat(){
        System.out.println("eat rice");
    }

    public Person() {
    }

    public Person(String name, String wid, int salary) {
        this.name = name;
        this.wid = wid;
        this.salary = salary;
    }
}
