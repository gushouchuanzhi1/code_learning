package day2;
/**对象中的构造方法，set和get方法
 * 使用alt+insert即可快捷构造*/
public class Game {
    //使用了private，只能在本类中访问该变量，可以使用方法来访问
    private String name;
    private int year;

    //亦可以在构造的时候传入参数，Game game = new Game();
    //即构造Game();
    public Game(){//已经使用了方法重载
        System.out.println("开始构造对象");
    }
    public Game(String name){
        setName(name);
        System.out.println(this.name);
    }

    public void setName(String name){
        //这里使用this.name，如果使用name会造成null，
        //this可以使用本类中的定义的那个值，而不是方法传入的参数
        //一个类中除静态外的成员，如果要运行，就必须得被对象调用
        this.name = name;
    }

    public void getName(){
        System.out.println(this.name);
    }


}
