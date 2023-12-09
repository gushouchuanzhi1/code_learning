package test.array;

public class test1 {
    public static void main(String[] args) {
        /**数组乱序，输出最大元素*/
        int []array=new int[]{5,326,671,54,12};
        int max = array[0];
        for(int i = 1; i< array.length;i++){
            if(max<array[i]) max = array[i];
        }
        System.out.println("数组最大值为"+max);
    }
}
