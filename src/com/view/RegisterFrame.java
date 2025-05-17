//用户可以输入用户名和密码并通过点击提交按钮进行注册操作。
package com.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterFrame {
    private static JFrame register = new JFrame("注册");//注册的容器
    private static RegisterFrame instance;

    public static RegisterFrame getInstance() {
        if (instance == null) {
            instance = new RegisterFrame();
        }
        return instance;
    }
    public void initRegister() {
        register.getContentPane().removeAll();//清空容器，防止重复添加
        register.setSize(250, 160);//窗口大小
        register.setLayout(new FlowLayout());
        register.setResizable(false);//禁止用户调整注册窗口的大小。
        register.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel jLabel1 = new JLabel("用户名：");
        JLabel jLabel2 = new JLabel("密  码：");
        JTextField jTextField = new JTextField(10);//文本框
        JPasswordField jPasswordField = new JPasswordField(10);//密码框
        jPasswordField.setEchoChar('*');//设置密码框显示为*
        Font font = new Font("宋体", Font.BOLD, 18);
        jLabel1.setFont(font);
        jLabel2.setFont(font);
        JButton jButton1 = new JButton("提交");//按钮
        jButton1.setFont(font);
        register.add(jLabel1);//加入容器中
        register.add(jTextField);
        register.add(jLabel2);
        register.add(jPasswordField);
        register.add(jButton1);
        register.setLocationRelativeTo(null);//窗口居中
        register.setVisible(true);//显示窗口，控制组件显示在屏幕上的

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = jTextField.getText();//获得用户名
                String userPassword = new String(jPasswordField.getPassword());//获得密码
                
                JOptionPane.showMessageDialog(
                        jButton1,
                        "注册成功!",
                        "提示",
                        JOptionPane.INFORMATION_MESSAGE//信息提示
                );
                register.dispose();
            }
        });
    }
    public static void main(String[] args) {
        RegisterFrame.getInstance().initRegister();
    }
}