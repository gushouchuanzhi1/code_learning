package day2;
public class object2 {
    /**本文件使用Game类 相关内容可见Game.java
     * 对象三个特征 封装继承多态
     * 封装：对象代表什么就封装什么属性、函数
     * 继承：
     * 多态：*/
    public static void main(String[] args) {
        Game g = new Game();
        g.setName("hello world");
        Game game = new Game("使用了构造方法");


    }
}
