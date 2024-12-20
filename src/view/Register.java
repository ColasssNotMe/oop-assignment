package view;

import java.awt.Button;
import java.awt.Choice;
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

import javax.swing.JFrame;

import base.BaseFrame;
import font.AllFont;
import base.WindowListenerImp;

public class Register extends BaseFrame {
    public Register() {
        super();
        JFrame root = getRoot();
        setTitle("Register");

        // CardLayout cardLayout = new CardLayout();
        // Panel mainPanel = new Panel(cardLayout);

        // First page
        Panel container = new Panel(new GridBagLayout());
        container.setBackground(Color.gray);
        container.setBounds(100, 100, 600, 400);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.CENTER;
        gbc.insets = new Insets(1, 1, 1, 1);

        Label pageTitle = new Label("Register");
        pageTitle.setAlignment(Label.CENTER);
        pageTitle.setBounds(200, -100, 400, 300);
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
        returnButton.setBounds(60, 30, 100, 40);
        Button nextButton = new Button("Next Page");
        nextButton.setPreferredSize(new Dimension(100, 40));

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
        container.add(nextButton, gbc);

        Panel secondPagePanel = new Panel(new GridBagLayout());
        secondPagePanel.setBackground(Color.gray);
        secondPagePanel.setBounds(100, 100, 600, 400);
        gbc.fill = GridBagConstraints.CENTER;
        gbc.insets = new Insets(1, 1, 1, 1);

        Label pageTitle2 = new Label("Register");
        pageTitle2.setBounds(200, -10, 400, 300);
        Label nationalityLabel = new Label("Are you Malaysian?");
        Label contactLabel = new Label("Enter your contact number");
        Label genderLabel = new Label("Gender");
        Label urgentContact = new Label("Enter an emergency contact number");

        contactLabel.setFont(font);
        nationalityLabel.setFont(font);
        genderLabel.setFont(font);
        urgentContact.setFont(font);
        pageTitle2.setFont(titleFont);

        // TODO: remove redundancy in font

        Font textFieldFont = new Font("Courier New", Font.PLAIN, 20);
        TextField contactTextField = new TextField();
        contactTextField.setPreferredSize(new Dimension(200, 30));
        contactTextField.setFont(textFieldFont);
        Choice genderChoice = new Choice();
        genderChoice.setPreferredSize(new Dimension(200, 30));
        genderChoice.setFont(textFieldFont);
        TextField urgenTextField = new TextField();
        urgenTextField.setPreferredSize(new Dimension(200, 30));
        urgenTextField.setFont(textFieldFont);
        TextField nationalityTextField = new TextField();
        nationalityTextField.setPreferredSize(new Dimension(200, 30));
        nationalityTextField.setFont(textFieldFont);

        // Button returnButton = new Button("Back");
        // returnButton.setBounds(60, 120, 100, 40);
        Button prevButton = new Button("Previous");
        prevButton.setPreferredSize(new Dimension(100, 40));
        Button registerButton = new Button("Register");
        registerButton.setPreferredSize(new Dimension(100, 40));

        // add components
        gbc.gridx = 0;
        gbc.gridy = 0;
        secondPagePanel.add(contactLabel, gbc);

        gbc.gridy = 1;
        secondPagePanel.add(contactTextField, gbc);

        gbc.gridy = 2;
        secondPagePanel.add(urgentContact, gbc);

        gbc.gridy = 3;
        secondPagePanel.add(urgenTextField, gbc);
        gbc.gridy = 4;
        secondPagePanel.add(genderLabel, gbc);
        gbc.gridy = 5;
        secondPagePanel.add(genderChoice, gbc);
        gbc.gridy = 6;
        secondPagePanel.add(nationalityLabel, gbc);
        gbc.gridy = 7;
        secondPagePanel.add(nationalityTextField, gbc);

        gbc.gridy = 8;
        gbc.gridx = 0;
        gbc.insets = new Insets(20, 0, 20, 0);
        secondPagePanel.add(prevButton, gbc);
        gbc.gridx = 1;
        secondPagePanel.add(registerButton, gbc);

        // gbc.gridy = 9;

        // mainPanel.add(container, "First Page");
        // mainPanel.add(secondPagePanel, "Second Page");
        // add(mainPanel);
        root.add(container);
        root.add(secondPagePanel);
        root.add(returnButton);
        root.add(pageTitle);
        addWindowListener(new WindowListenerImp());

        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                root.dispose();
                new MainMenu();
            }
        });
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validation(icTextField, usernameTextField, passwordTextField, rePasswordTextField, contactTextField,
                        urgenTextField, genderChoice, nationalityTextField, true)) {
                }
            }
        });
        prevButton.addActionListener(e -> {
        });
        nextButton.addActionListener(e -> {
            container.setVisible(false);
        });
    };

    // FIXME: remove testing
    private boolean validation(TextField ic, TextField username, TextField password, TextField rePassword,
            TextField contactNumber, TextField emergencyContact, Choice gender, TextField boolMalaysian,
            Boolean testing) {
        if (testing == true) {
            return true;
        }
        if (ic.getText().length() != 12) {
            return false;
        }
        if (password.getText() != rePassword.getText()) {
            return false;
        }
        if (contactNumber.getText() == "") {
            return false;
        }
        if (emergencyContact.getText() == "") {
            return false;
        }
        // TODO: check if the username is available
        // if (username == data) {
        // }
        return testing;
    }

}
