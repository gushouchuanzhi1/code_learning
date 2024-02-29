package test.xunhuan;

public class test2 {
    public static void main(String[] args) {
        /**
         * 不能使用除法以及%和乘法，得到商和余数
         * */
        int x,y,z,m;//被除数，除数，商，余数
        x = 123214;
        y = 3432;
        z = 0;
        m = 0;
        int temp = x;
        while(temp >= y){
            temp = temp - y;
            z++;
        }
        m = temp;
        System.out.println("商为" + z + "余数为" + m);
    }
}
