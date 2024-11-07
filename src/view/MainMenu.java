package view;

import java.awt.Label;
import java.awt.Panel;
import java.awt.BorderLayout;
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
        setLayout(new BorderLayout());
        setBackground(Color.blue);

        // Panel
        Panel container = new Panel(new GridLayout(2, 1, 100, 50));
        Panel buttonPanel = new Panel(new GridLayout(2, 1, 100, 20));
        buttonPanel.setBackground(Color.black);
        Panel titlePanel = new Panel(new FlowLayout());
        titlePanel.setBackground(Color.white);

        // init font
        Label titleText = new Label("Main Menu");
        Font titleFont = new Font("Arial", Font.PLAIN, 36);
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
        container.add(titlePanel);
        container.add(buttonPanel);
        add(container, BorderLayout.CENTER);
    }
}
