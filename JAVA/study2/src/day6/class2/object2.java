package day6.class2;
/**本文件开始学习继承：两个对象共有的部分可以提取出来作为父类，用于给字类继承。
 * public class Son extends Father{}
 * 子类可以继承父类所有成员变量以及public的成员方法，完全不继承构造方法*/
public class object2 {
    public void main(String[] args) {
        //多次继承，同名的方法会有方法重写，运行该类中的方法
        //例如Fat继承Grand，只会调用Fat中的
        Fat f = new Fat();
        f.method();

    }
    class Grand {
        public void method(){
            System.out.println("this is grand");
        }
    }

   class Fat extends Grand{
        public void method(){
            System.out.println("this is fat");
        }
    }
}

