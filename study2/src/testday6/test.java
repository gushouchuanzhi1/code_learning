package testday6;

public class test {
    public static void main(String[] args) {
        Manager m = new Manager("gsc","3924",9000,8000);//ctrl+p来查询填写帮助
        System.out.println(m.getName() + "," + m.getWid() + "," + m.getSalary() + "," + m.getBonus());
        m.work();m.eat();

        Cook c = new Cook("cooker","2314",7000);
        c.work();c.eat();
    }

}
