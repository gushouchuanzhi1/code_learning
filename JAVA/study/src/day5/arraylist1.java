package day5;

import java.util.ArrayList;

/**数组创建之后长度是不能发生变化的
 * 集合创建之后还是可以变化长度的
 * 数组可以存储基本类型也可以存储引用数据类型
 * 集合只可以直接存储基本类型数据
 * */
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("nihao");
        list.add("woo");
        printList(list);
        System.out.println("try sout(list)");
        System.out.println(list);
    }


    public static void printList(ArrayList<String> list){
        System.out.print("[");
        for(int i = 0; i< list.size();i++){
            if(i==list.size()-1) {
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+',');
            }
        }
        System.out.print(']');
        System.out.println("");
    }
}
