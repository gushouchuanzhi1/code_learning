package day2;
/**面向对象 本文件使用Phone类*/
public class object1 {
    public static void main(String[] args) {
        //在包内另一个java文件定义类 Phone类
        Phone myphone = new Phone();
        //通过变量名.（）的方式来调用对象中的内容
        myphone.price = 156.3;
        myphone.getprice();
    }

}
