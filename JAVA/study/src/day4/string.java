package day4;
/**字符串和API接口
 * 常见使用的Scanner Random等接口
 * 字符串需要学习：StringBuilder、StringBuffer、StringJonier等
 * 本文件学习string类型*/
public class string {
    public static void main(String[] args) {
        //直接构造String
        String name = "john";
        String greeting = "hello";
        String say = name + greeting;
        System.out.println(say);
        //字符字节数组来构造字符串
        char []greet = new char[]{'h','e','l','l','o'};
        String GreetByCharArray = new String(greet);
        System.out.println("这是由字符数组创建的" + GreetByCharArray);
        //equals equalsIgnoreCase都可以来比较字符串内容 后者可以忽略大小写
        System.out.println(greeting.equals(GreetByCharArray));

    }

}
