package test.array;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        /**需要打乱已给数组的元素顺序*/
        Random r = new Random();
        int []array = new int[]{1,2,3,4,5};
        int temp = 0;
        for(int i = 0;i< array.length;i++){//随机交换元素
            int exchange = r.nextInt(array.length);
            temp = array[exchange];
            array[exchange] = array[i];
            array[i] = temp;
        }
        for (int i : array) {
            System.out.println(i);
        }

    }
}
