package view;

import java.awt.Label;
import java.awt.Panel;
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

        // init font
        Label titleText = new Label("Main Menu");
        Font titleFont = new Font("Comic Sans MS", Font.PLAIN, 36);
        Font buttonFont = new Font("Arial", Font.PLAIN, 18);

        // titleText settings
        titleText.setFont(titleFont);
        titleText.setAlignment(Label.CENTER);

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
    }
}
