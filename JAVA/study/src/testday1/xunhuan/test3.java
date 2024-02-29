package test.xunhuan;

public class test3 {
    public static void main(String[] args) {
        /**
         * 每逢7的倍数或者含有7就跳过该数字
         * */
        for(int i = 0; i <= 100 ; i++){
            if(i % 7 == 0){
                continue;
            }
            if(i % 10 == 0 || i / 10 == 7){
                continue;
            }
            System.out.println("the number is " + i);
        }
    }
}
