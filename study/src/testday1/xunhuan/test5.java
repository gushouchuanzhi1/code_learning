package test.xunhuan;

import javax.script.ScriptContext;
import java.util.Random;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        /**
         * 猜数字 1-100
         * */
        int number = new Random().nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("已经生成了一个数字，请猜数字1-100");
        int lnum = 1, rnum = 100;
        System.out.println("请输入你的数字：");
        int guess = sc.nextInt();
        int cnt = 1;//猜的次数
        while(guess != number){
            if(guess<number){
                lnum = guess;
                System.out.println("你猜错了，下一次的范围是"+lnum+"到"+rnum);
            }
            if(guess>number){
                rnum = guess;
                System.out.println("你猜错了，下一次的范围是"+lnum+"到"+rnum);
            }
            cnt++;
            System.out.println("请输入你的数字：");
            guess = sc.nextInt();
        }
        System.out.println("恭喜你，你猜对了，你一共猜了"+cnt+"次");
    }
}
