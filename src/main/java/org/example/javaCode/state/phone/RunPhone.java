package org.example.javaCode.state.phone;

import javax.swing.*;

public class RunPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        JButton home = new JButton("Home");
        home.addActionListener(e -> phone.getState().onHome());
        System.out.println(phone.getState().onHome());
        JButton onOff = new JButton("On/Off");
        System.out.println(phone.getState().onOffOn());
        onOff.addActionListener(e -> phone.getState().onOffOn());
    }
}
