package ru.fundcount.test;

import javax.swing.*;

public class Application {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        MainFrame mainFrame = new MainFrame();
        mainFrame.start();
    }
}
