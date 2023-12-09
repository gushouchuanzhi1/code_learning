package testday4;

import java.util.Scanner;

/**charat方法可以帮助找到索引处的字符
 * substring(int start,int end)截取子串，包左不包右
 * 在本文件中实现将电话号码的中间四位变为****
 * 可以使用replace(String,String)方法将某段更换为某段*/
public class test2 {
    public static void main(String[] args) {
        Scanner PhoneNumber = new Scanner(System.in);
        System.out.println("请输入电话号码");
        String InputPhone = PhoneNumber.nextLine();
        String CodePhone = code(InputPhone);
        System.out.println("加密后的电话号码是" + CodePhone);
    }
     public static String code(String phone){
        //也可以直接使用相关的API直接替换
        String CodePhone = phone.substring(0,3) +  "****" + phone.substring(7);
        return CodePhone;
    }
}
