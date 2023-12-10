package day5;
/**stringbuilder看作一个容器，创建之后里面的内容可以改变
 * 可以加快字符串处理的速度 StringBuilder s1 = new StringBuilder();
 * 常见方法比如.append(任意类型)添加新的内容 比如.reverse将内容反转
 * .length()方法  .toString()方法*/
public class learnstringbuilder {
    public static void main(String[] args) {
        //对于StringBuilder由于做了一些处理，打印的是属性值而不是地址
        StringBuilder s1 = new StringBuilder("abc");
        s1.append(123);
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        System.out.println(s1.length());
        String s2 = new String(s1.toString());
        System.out.println(s2);
    }
}
