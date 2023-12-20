package day7.class3;

public class test {
    public static void main(String[] args) {
        final int a = 100;
        //这里的a是常量了 不能再修改值
        System.out.println(a);
        //失败 a = 2000;

    }

}

class Fu{
    public final void show(){
        System.out.println("this is fu");
    }
}
class Zi extends Fu{
    //public void show(){ } 不能使用方法重写，因为父类已经final修饰了
}
