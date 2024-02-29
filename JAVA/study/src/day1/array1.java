package day1;
/**数组*/
public class array1 {
    public static void main(String[] args) {
        //定义数组 只能静态初始化 明确元素内容
        int []array1= new int[]{1,2,3};
        //遍历输出数组、下标
        System.out.println(array1); //输出数组的地址[I@776ec8df I为int
        for(int i = 0; i< array1.length;i++){
            System.out.println(array1[i]);
        }
        //动态初始化数组 只是明确元素数量
        int []array2=new int[4];


    }
}
