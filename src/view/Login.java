package view;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JTextField;

import javax.swing.JFrame;

import base.BaseFrame;
import font.AllFont;
import base.WindowListenerImp;
import color.CustomColor;

public class Login extends BaseFrame {

    Object[] userData = { 1, "name", "password", 010, 05, "male", 2, 011, "manager" };

    public Login() {
        super();
        JFrame root = getRoot();
        root.setTitle("Login");
        root.setLayout(null);
        root.setBackground(CustomColor.BACKGROUND_COLOR);

        Panel container = new Panel(new GridBagLayout());
        container.setBackground(CustomColor.CONTAINER_BACKGROUND);
        container.setBounds(100, 100, 600, 400);

        // Add subtle shadow effect
        container.setForeground(new Color(0, 0, 0, 50));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);

        Label pageTitle = new Label("Login");
        pageTitle.setAlignment(Label.CENTER);
        pageTitle.setBounds(200, -100, 400, 300);
        pageTitle.setForeground(CustomColor.TEXT_COLOR);

        Label icLabel = new Label("IC Number");
        Label passwordLabel = new Label("Password");
        Label errorLabel = new Label("Incorrect username or password");
        errorLabel.setForeground(CustomColor.ERROR_COLOR);
        errorLabel.setVisible(false);

        Font titleFont = AllFont.TITLE_TEXT;
        Font labelFont = AllFont.LABEL_TEXT;

        pageTitle.setFont(titleFont);
        icLabel.setFont(labelFont);
        passwordLabel.setFont(labelFont);
        errorLabel.setFont(labelFont);

        JTextField icTextField = createStyledTextField();
        JTextField passwordTextField = createStyledTextField();
        // Password masking

        JButton returnButton = createStyledButton("Back", false);
        returnButton.setBounds(60, 30, 100, 40);

        JButton loginButton = createStyledButton("Login", true);
        loginButton.setPreferredSize(new Dimension(200, 45));

        // Placeholder/Focus listeners for text fields
        addPlaceholderEffect(icTextField, "Enter IC Number");
        addPlaceholderEffect(passwordTextField, "Enter Password");

        // add components
        gbc.gridx = 0;
        gbc.gridy = 0;
        container.add(icLabel, gbc);

        gbc.gridy = 1;
        container.add(icTextField, gbc);

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

        root.add(container);
        root.add(returnButton);
        root.add(pageTitle);
        addWindowListener(new WindowListenerImp());
        returnButton.addActionListener((e) -> {
            root.dispose();
            new MainMenu();
        });
        // buttonListener(returnButton, loginButton, icTextField, passwordTextField,
        // errorLabel, root);
    }

}