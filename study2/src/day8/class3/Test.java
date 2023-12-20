package day8.class3;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {



        new Swim(){
            @Override
            public void swim() {//方法重写
                System.out.println("重写了Swim接口的方法swim");
            }
        };



    }


}
