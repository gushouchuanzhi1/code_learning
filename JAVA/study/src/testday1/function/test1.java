package test.function;

public class test1 {
    public static void main(String[] args) {
        /**编写一个方法实现复制一个数组起始点为from，终止点位to*/
        int[] array = new int[]{1,2,3,4,5};
        int[] result = copy(array,1,5);
        printArray(result);

        System.out.println("下面进行方法传递参数示例1");
        System.out.println(result[1]);
        change(result);//方法传递参数
        //像int类型等是值传递，属于基本数据类型
        //像int[] array1,array2; array2 = array1 属于是引用数据类型，通过地址来改变
        System.out.println(result[1]);

        System.out.println("下面进行方法传递参数示例2");
        int a = 3;
        System.out.println(a);//3
        change(a);//由于这里是int类型，属于是值传递，并不会改变a所在地址的实际值。
        System.out.println(a);//3
    }
    public static int[] copy(int[] array,int from, int to){//复制函数
        int[] result=new int[to - from + 1];
        for(int i = from -1; i < to; i++) {
            result[i + 1 - from] = array[i];
        }
        return result;
    }
    public static void printArray(int[] array){//打印函数
        for(int i = 0; i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void change(int[] array){//函数调用在栈内存，数组等相关值是在堆内存
        array[1] = 20;
    }
    public static void change(int a){
        a = 20;
    }
}
