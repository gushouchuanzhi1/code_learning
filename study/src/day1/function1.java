package day1;

public class function1 {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int c = add(2,3);
        System.out.println(c);
        int d = add(a,b,c);
        System.out.println(d);
        add(a,b,c,d);
    }
    public static int add(int a, int b){//普通的方法调用，并且有int类型返回值
        return  a+b;
    }
    public static int add(int a,int b,int c){//方法的重载,只有函数名相同
        return a+b+c;
    }
    public static void add(int a, int b, int c, int d){//方法的重载，只有函数名相同
        System.out.println(a+b+c+d);
    }

}
