package test.xunhuan;
public class test1 {
    public static void main(String[] args) {
        /**
         * 判断x是否为回文数
         * */
        int x = 123;
        int y = 0, origin = x;
        int temp = 0;
        while(x > 0){
            temp = x % 10;
            y = y*10 + temp;
            x = x /10;
        }
        if (y == origin) System.out.println("true");
        else System.out.println("false");
    }

}
