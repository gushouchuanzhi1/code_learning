package day5;

import java.util.ArrayList;

/**集合arraylist构造如下：
 * ArrayList<泛型> list = new ArrayList<>()
 * 这里的泛型为包装类 其中有变化的为int-integer char-character
 * 常见使用get方法、add方法、size方法*/
public class arraylist2 {
    public static void main(String[] args) {
        //创建集合输入整数 最后按规则输出
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        list.add(3);
        list.add(4);
        System.out.println(list);
    }


}
