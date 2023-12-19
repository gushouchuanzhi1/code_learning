package testday6;

public class Manager extends Person{
    private int bonus;

    public Manager(){}

    public Manager(String name, String wid, int salary, int bonus) {
        //前面三个传递给了父类super，后面的子类属性给this来在子类中创造
        super(name, wid, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    @Override
    public void work(){
        System.out.println("the manage manage others");
    }
}
