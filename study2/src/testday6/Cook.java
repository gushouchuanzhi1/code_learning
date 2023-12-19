package testday6;

public class Cook extends Person{
    @Override
    public void work(){
        System.out.println("cooking meals");
    }

    public Cook() {
    }

    public Cook(String name, String wid, int salary) {
        super(name, wid, salary);
    }
}
