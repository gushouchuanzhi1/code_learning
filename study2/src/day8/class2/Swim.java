package day8.class2;

public interface Swim {
    public void swim();
    public default void show(){
        System.out.println("this is default function in interface Swim");
    }

}
