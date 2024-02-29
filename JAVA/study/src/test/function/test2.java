package test.function;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        int[] code = yanzhengma(8);
        printArray(code);
    }
    public static int[] yanzhengma(int a){//生成a位的验证码
        Random r = new Random();
        int[] yzm = new int[a];
        for(int i = 0; i<yzm.length;i++){
            yzm[i] = r.nextInt(9);
        }
        return yzm;
    }
    public static void printArray(int[] array){//打印函数
        for(int i = 0; i< array.length;i++){
            System.out.print(array[i]);
        }
    }
}
