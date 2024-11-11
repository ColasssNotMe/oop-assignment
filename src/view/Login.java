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

import font.AllFont;
import util.WindowListenerImp;

// ...existing imports...

public class Login extends BaseFrame {

    public Login() {
        super();
        setTitle("Login");
        setVisible(true);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);

        Panel container = new Panel(new GridBagLayout());
        container.setBackground(Color.gray);
        container.setBounds(100, 180, 600, 400);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 1, 5, 1);

        Label pageTitle = new Label("Login");
        pageTitle.setAlignment(Label.CENTER);
        pageTitle.setBounds(200, -10, 400, 300);
        Label usernameLabel = new Label("Username");
        usernameLabel.setAlignment(Label.LEFT);
        Label passwordLabel = new Label("Password");
        passwordLabel.setAlignment(Label.LEFT);
        Label errorLabel = new Label("Password does not match");
        errorLabel.setVisible(false);

        Font titleFont = AllFont.titleFont;
        Font font = new Font("Comic Sans MS", Font.PLAIN, 24);
        usernameLabel.setFont(font);
        passwordLabel.setFont(font);
        pageTitle.setFont(titleFont);
        errorLabel.setFont(font);

        TextField usernameTextField = new TextField();
        usernameTextField.setPreferredSize(new Dimension(200, 30));
        usernameTextField.setFont(new Font("Courier New", Font.PLAIN, 20));
        TextField passwordTextField = new TextField();
        passwordTextField.setPreferredSize(new Dimension(200, 30));
        passwordTextField.setFont(new Font("Courier New", Font.PLAIN, 20));

        Button returnButton = new Button("Back");
        returnButton.setBounds(60, 120, 100, 40);
        Button loginButton = new Button("Login");
        loginButton.setPreferredSize(new Dimension(100, 40));

        // add components
        gbc.gridx = 0;
        gbc.gridy = 0;
        container.add(usernameLabel, gbc);

        gbc.gridy = 1;
        container.add(usernameTextField, gbc);

        gbc.gridy = 2;
        container.add(passwordLabel, gbc);

        gbc.gridy = 3;
        container.add(passwordTextField, gbc);

        gbc.gridy = 4;
        gbc.insets = new Insets(20, 0, 10, 0);
        container.add(loginButton, gbc);

        gbc.gridy = 5;
        gbc.insets = new Insets(10, 20, 10, 20);
        container.add(errorLabel, gbc);

        add(container);
        add(returnButton);
        add(pageTitle);
        // container.add(containerPanel, BorderLayout.CENTER);
        addWindowListener(new WindowListenerImp());
        buttonListener(returnButton, loginButton, usernameTextField, passwordTextField, errorLabel);
    }

    private void buttonListener(Button returnButton, Button loginButton, TextField usernameTextField,
            TextField passwordTextField, Label errorLabel) {
        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MainMenu();
            }
        });

        loginButton.addActionListener(new ActionListener() {
            // TODO: create a login function if credential match
            // TODO: load data from gan's function
            public void actionPerformed(ActionEvent e) {
                // String[] data = new Data();
                // userData = data.getData();
                String username = usernameTextField.getText();
                String password = passwordTextField.getText();
                // if (username == userData[1] && password == userData[2]) {
                if (false) {
                    // TODO: check for user type
                    if(){

                    }else if () {

                    }else if () {

                    };
                } else {
                    System.out.println("else");
                    errorLabel.setVisible(true);

                }
            }
        });
    }

}