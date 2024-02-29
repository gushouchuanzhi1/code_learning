package day5;

import java.util.StringJoiner;

/**stringjoiner类型也可以看作是一个容器
 * 提高字符串的操作效率，代码编写也简洁
 * */
public class learnstringjoiner {
    public static void main(String[] args) {
        /*public StringJoiner(间隔符号，开始符号，结束符号)
        * 创建一个stringjoiner对象，指定了*/
        StringJoiner sj = new StringJoiner("-----","{","}");
        sj.add("aaa").add("342").add("*-/-*");
        System.out.println(sj);//{aaa-----342-----*-/-*}

    }


}
