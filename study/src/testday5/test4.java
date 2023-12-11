package testday5;

import java.util.ArrayList;
import java.util.Scanner;

/**存入三个用户对象 id username password
 * 定义一个方法，根据id查找对应的用户信息
 * 使用User.java*/
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        users = insertUser(users);
        System.out.println("下面将进行查询id操作");
        System.out.print("请输入你需要查询的id： ");
        String id = sc.next();
        if(getUser(id, users)){
            System.out.println("true");
        }else System.out.println("false");

    }

    public static boolean getUser(String id,ArrayList<User> users){
        //这里规定了id都为string，所以需要使用equals来进行比较
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getId().equals(id)) return true;
        }
        return false;
    }

    public static ArrayList<User> insertUser(ArrayList<User> users){
        System.out.println("本次输入用户数量为：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            User user = new User();
            System.out.println("请依次输入该用户的id、username以及password");
            user.setId(sc.next());
            System.out.println("get id!");
            user.setUsername(sc.next());
            System.out.println("get username!");
            user.setPassword(sc.next());
            System.out.println("get password!");
            System.out.println((i+1) + "位用户信息填写成功");
            users.add(user);
        }
        return users;
    }

}
