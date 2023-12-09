package testday4;

import java.util.Scanner;

/**已知正确的用户名和密码
 * 用户有三次登录机会
 * 登陆成功显示信息 登陆错误显示信息*/
public class test1 {
    public static void main(String[] args) {
        String id = "gushouchuan";
        String pwd = "052320";
        String InputId = new String();
        String InputPwd = new String();
        Scanner sId = new Scanner(System.in);
        Scanner sPwd = new Scanner(System.in);
        int TryCnt = 0, chance = 3;
        while(TryCnt < 3){
            TryCnt++;
            System.out.println("请输入用户名:");
            InputId = sId.nextLine();
            System.out.println("请输入密码:");
            InputPwd = sPwd.nextLine();
            if(id.equals(InputId) && pwd.equals(InputPwd)){//输入正确
                System.out.println("输入正确，欢迎进入系统!");
                return;
            }
            else{
                chance--;
                System.out.println("用户名或者密码错误，请重新输入!您还有" + chance + "次机会");
            }
        }
        System.out.println("输入错误次数超过3次，退出系统");


    }

}
