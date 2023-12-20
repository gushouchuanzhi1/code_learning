package day8.class3;

public class Car {
    private String carName;
    private int carAge;
    private String carColor;
    public void show(Car this){
        //需要使用创建内部类才能调用内部类成员
        System.out.println(this.carAge);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }
    class Engine{
        String engineName;
        int engineAge;
        public void show(){
            System.out.println(engineName);
            System.out.println(carAge);
        }

    }


}
