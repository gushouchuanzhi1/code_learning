package testday7;

public class Person {
    private String name;
    private int age;
    public void keepPet(Animal a,String something){
        if(a instanceof Dog){
            Dog d = (Dog) a;
            keepPet(d,something);
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
            keepPet(c,something);
        }
    }
    public void keepPet(Dog d,String something){
        keepPet(d);
        d.eat(something);
    }
    public void keepPet(Cat c,String something){
        keepPet(c);
        c.eat(something);
    }
    public void keepPet(Dog d){//谁养的
        System.out.println(this.getAge() + "的" + this.getName() + "养了" + d.getColor() + "的" + d.getAge() + "岁的狗");
    }
    public void keepPet(Cat c){//谁养的
        System.out.println(this.getAge() + "的" + this.getName() + "养了" + c.getColor() + "的" + c.getAge() + "岁的猫");
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

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
