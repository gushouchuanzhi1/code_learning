package testday3;
/**使用包：Character.java
 * 创建两个角色互相攻击*/
public class test1 {
    public static void main(String[] args) {
        Character a = new Character("a",1000,50);
        Character b = new Character("b",980,54);
        while(a.getSurvive()!=0 && b.getSurvive()!=0){
            a.attack(b);
            b.attack(a);
        }
    }

}
