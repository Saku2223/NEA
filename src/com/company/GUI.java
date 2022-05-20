package com.company;

import javax.swing.*;

public class GUI {

    public static void GUI() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Press");
        frame.getContentPane().add(button1); // Adds Button to content pane of frame
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        CreateFile();
        CreateFile2();
        WriteToFile();
        System.out.println("Do you want to delete this file now? If you do then type 'Y'");
        String userOption = input.next();
        if (userOption.equals("Y")) {
            DeleteFile();
        }
        for (int j = 0; j < 4; j++) {
            ShowMenu();
}
