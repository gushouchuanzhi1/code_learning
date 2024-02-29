package com.gushouchuan.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {//只生成了界面，还需要调整生成条件
        //JFrame是游戏界面，可以修改界面名称
        JFrame gameJFrame = new JFrame("游戏界面");
        //设置窗口大小，以像素为单位。
        gameJFrame.setSize(860,650);
        gameJFrame.setVisible(true);
        //创建登录界面
        JFrame loginJFrame = new JFrame("登陆界面");
        loginJFrame.setSize(650,590);
        loginJFrame.setVisible(true);
        //创建注册界面
        JFrame registerJFrame = new JFrame("注册界面");
        registerJFrame.setSize(700,630);
        registerJFrame.setVisible(true);

    }


}
