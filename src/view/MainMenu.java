package view;

import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class MainMenu extends BaseFrame {
    public MainMenu() {
        super();
        setTitle("Main Menu");
        setVisible(true);
        setLayout(null);

        // Panel
        Panel buttonPanel = new Panel(new GridLayout(2, 1, 100, 20));
        buttonPanel.setBackground(Color.white);
        buttonPanel.setBounds(300, 300, 200, 200);
        Panel titlePanel = new Panel(new FlowLayout());
        titlePanel.setBackground(Color.white);
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
        add(titlePanel);
        add(buttonPanel);
        setupButtonListeners(loginButton, registerButton);
    };

    private void setupButtonListeners(Button loginButton, Button registerButton) {
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                new Login();
                dispose();
            }
        });

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                new Register();
                dispose();
            }
        });
    }
}
