package testday5;

import java.util.Scanner;

/**键盘录入一个字符串，程序判断该字符串是否是对称字符串*/
public class test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串，来判断是否是对称字符串");
        String origin = s.nextLine();
        //将字符串导入stringbuilder的变量
        StringBuilder sb = new StringBuilder(origin);
        String s2 = new StringBuilder().append(origin).reverse().toString();
        //对于判断是否相同 使用string的equals函数
        if(origin.equals(s2)) System.out.println("是的");
        else System.out.println("不是");
    }
}
