package view;

import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import base.BaseFrame;
import base.WindowListenerImp;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class MainMenu extends BaseFrame {
    public MainMenu() {
        super();
        JFrame root = getRoot();
        root.setTitle("Main menu");
        // setLayout(null);
        // setVisible(true);
        // setBackground(Color.lightGray);

        // Panel
        Panel buttonPanel = new Panel(new GridLayout(2, 1, 100, 20));
        buttonPanel.setBounds(300, 200, 200, 200);
        Panel titlePanel = new Panel(new FlowLayout());
        titlePanel.setBounds(300, 100, 200, 100);

        // init font and text
        Font titleFont = new Font("Cascadia Code", Font.PLAIN, 40);
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 18);
        Label titleText = new Label("Main menu");
        titleText.setFont(titleFont);

        // button init
        Button loginButton = new Button("Login");
        Button registerButton = new Button("Register");

        // setting size and location
        loginButton.setFont(buttonFont);
        registerButton.setFont(buttonFont);

        // add
        titlePanel.add(titleText);
        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);
        root.add(titlePanel);
        root.add(buttonPanel);
        setupButtonListeners(loginButton, registerButton, root);

        root.addWindowListener(new WindowListenerImp());

        root.setLocation(500, 250);
        root.setVisible(true);
    }

    private void setupButtonListeners(Button loginButton, Button registerButton, JFrame root) {
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                root.dispose();
                new Login();
            }
        });

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                root.dispose();
                new Register();
            }
        });
    }
}