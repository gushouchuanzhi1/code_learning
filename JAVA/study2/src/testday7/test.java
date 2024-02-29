package testday7;

public class test {
    public static void main(String[] args) {
        Animal a1 = new Dog(2,"黑色","小犬");
        Animal a2 = new Cat(3,"白色","小喵");
        Keeper k1 = new Keeper("zhangsan",20);
        Keeper k2 = new Keeper("lisi",30);
        k1.keepPet(a1,"狗骨头");
        k2.keepPet(a2,"小鱼干");

    }

}
