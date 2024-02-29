package studentManageSystem;


import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int operate = 1;
        while (operate != 5) {
            printMenu();
            operate = sc.nextInt();
            switch (operate) {
                case 1://添加学生
                    System.out.println("进行添加学生操作");
                    inputStudent(students);
                case 2://删除学生
                    System.out.println("进行删除学生操作");
                    System.out.println("您想要删除的学生id为：");
                    String deleteID = sc.next();
                    Delete(deleteID,students);
                case 3://修改学生
                    System.out.println("进行修改学生操作");
                    System.out.println("您想要修改的学生id为：");
                    String RewriteID = sc.next();
                    Rewrite(RewriteID,students);
                case 4://查询学生
                    System.out.println("进行查询学生操作");
                    printAllStudents(students);
                case 5:
                    System.out.println("感谢您使用本系统");
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
            }
        }

    }

    public static void printMenu() {
        System.out.println("----------welcome to the student manage system----------");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出");
        System.out.println("请输入您的选择：");
    }

    public static boolean judgeOnly(String inputID, ArrayList<Student> students) {
        //添加功能判断唯一性
        if (students.isEmpty()) {
            return true;
        } else {
            for (Student student : students) {
                if (student.getId().equals(inputID)) {
                    System.out.println("该id已经存在！");
                    return false;
                } else continue;
            }
            return true;
        }
    }

    public static void inputStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("需要输入的学生数量为：");
        int studentNumber = sc.nextInt();
        for (int i = 0; i < studentNumber; i++) {
            System.out.println("第" + (i + 1) + "个学生信息填写如下：");
            Student student = new Student();
            System.out.println("学生id为：");
            String id = sc.next();
            while (!judgeOnly(id, students)) {
                System.out.println("请重新输入该位学生的id！");
                id = sc.next();
            }
            student.setId(id);
            System.out.println("该id没有重复出现可以使用");
            System.out.println("学生姓名为：");
            student.setName(sc.next());
            System.out.println("学生年龄为：");
            student.setAge(sc.nextInt());
            System.out.println("学生家庭住址为：");
            student.setAddress(sc.next());
        }
    }

    public static void Delete(String deleteID, ArrayList<Student> students) {
        //删除判断
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(deleteID)) {
                students.remove(i);
                System.out.println("成功删除该元素");
                return;
            } else continue;
        }
        System.out.println("不存在该id的学生");
        //返回初始菜单
    }

    public static void Rewrite(String rewriteID, ArrayList<Student> students) {//修改功能
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(rewriteID)) {//进行修改
                System.out.println("即将进行修改，对id为"+students.get(i).getId()+"学生进行修改操作");
                System.out.println("学生id为：");
                String id = sc.next();
                while (!judgeOnly(id, students)) {
                    System.out.println("请重新输入该位学生的id！");
                    id = sc.next();
                }
                students.get(i).setId(id);
                System.out.println("该id没有重复出现可以使用");
                System.out.println("学生姓名为：");
                students.get(i).setName(sc.next());
                System.out.println("学生年龄为：");
                students.get(i).setAge(sc.nextInt());
                System.out.println("学生家庭住址为：");
                students.get(i).setAddress(sc.next());
                return;
            } else continue;
        }
        //返回初始菜单
    }
    public static void printAllStudents(ArrayList<Student> students){//查询学生
        if(!students.isEmpty()){
            for(int i = 0;i<students.size();i++){
                System.out.println("第"+(i+1)+"位学生的id，姓名，年龄，家庭住址分别为"+students.get(i).getId()+
                        students.get(i).getName()+students.get(i).getAge()+students.get(i).getAddress());
            }
        }else{
            System.out.println("当前无学生信息，请添加后再进行查询。");
        }
    }


}
