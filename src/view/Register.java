package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import base.BaseFrame;
import font.AllFont;
import base.WindowListenerImp;

// ...existing imports...

public class Register extends BaseFrame {
    public Register() {
        super();
        setTitle("Login");

        Panel container = new Panel(new GridBagLayout());
        container.setBackground(Color.gray);
        container.setBounds(100, 180, 600, 400);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.CENTER;
        gbc.insets = new Insets(1, 1, 1, 1);

        Label pageTitle = new Label("Register");
        pageTitle.setAlignment(Label.CENTER);
        pageTitle.setBounds(200, -10, 400, 300);
        Label usernameLabel = new Label("Create a new username");
        usernameLabel.setAlignment(Label.LEFT);
        Label icLabel = new Label("Enter IC/Passport No.");
        icLabel.setAlignment(Label.LEFT);
        Label passwordLabel = new Label("Password");
        passwordLabel.setAlignment(Label.LEFT);
        Label rePasswordLabel = new Label("Enter password again");
        rePasswordLabel.setAlignment(Label.LEFT);

        Font titleFont = AllFont.titleFont;
        Font font = new Font("Comic Sans MS", Font.PLAIN, 24);
        icLabel.setFont(font);
        usernameLabel.setFont(font);
        passwordLabel.setFont(font);
        rePasswordLabel.setFont(font);
        pageTitle.setFont(titleFont);

        TextField icTextField = new TextField();
        icTextField.setPreferredSize(new Dimension(200, 30));
        icTextField.setFont(new Font("Courier New", Font.PLAIN, 20));
        TextField usernameTextField = new TextField();
        usernameTextField.setPreferredSize(new Dimension(200, 30));
        usernameTextField.setFont(new Font("Courier New", Font.PLAIN, 20));
        TextField passwordTextField = new TextField();
        passwordTextField.setPreferredSize(new Dimension(200, 30));
        passwordTextField.setFont(new Font("Courier New", Font.PLAIN, 20));
        TextField rePasswordTextField = new TextField();
        rePasswordTextField.setPreferredSize(new Dimension(200, 30));
        rePasswordTextField.setFont(new Font("Courier New", Font.PLAIN, 20));

        Button returnButton = new Button("Back");
        returnButton.setBounds(60, 120, 100, 40);
        Button registerButton = new Button("Login");
        registerButton.setPreferredSize(new Dimension(100, 40));

        // add components
        gbc.gridx = 0;
        gbc.gridy = 0;
        container.add(icLabel, gbc);

        gbc.gridy = 1;
        container.add(icTextField, gbc);

        gbc.gridy = 2;
        container.add(usernameLabel, gbc);

        gbc.gridy = 3;
        container.add(usernameTextField, gbc);
        gbc.gridy = 4;
        container.add(passwordLabel, gbc);
        gbc.gridy = 5;
        container.add(passwordTextField, gbc);
        gbc.gridy = 6;
        container.add(rePasswordLabel, gbc);
        gbc.gridy = 7;
        container.add(rePasswordTextField, gbc);

        gbc.gridy = 8;
        gbc.insets = new Insets(20, 0, 20, 0);
        container.add(registerButton, gbc);

        add(container);
        add(returnButton);
        add(pageTitle);
        // container.add(containerPanel, BorderLayout.CENTER);
        addWindowListener(new WindowListenerImp());

        buttonListener(returnButton, registerButton, icTextField, rePasswordTextField);
    }

    private void buttonListener(Button returnButton, Button registerButton, TextField rePasswordTextField,
            TextField passwordTextField) {
        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MainMenu();
            }
        });

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                passwordEqual(passwordTextField, rePasswordTextField);
            }
        });
    }

    private boolean passwordEqual(TextField passworTextField, TextField rePasswordTextField) {
        if (passworTextField.getText() != rePasswordTextField.getText()) {
            return false;
        } else {
            return true;
        }
    };
    // ...existing code...
}
