package test.xunhuan;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        /**
         * 判断是否为质数
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int number = sc.nextInt();
        int flag = 1;
        for(int i = 2; i<=Math.sqrt(number);i++){
            if(number % i == 0){
                flag = 0;
            }
        }
        if(flag == 0) System.out.println("不是质数");
        else System.out.println("是质数");
    }
}
