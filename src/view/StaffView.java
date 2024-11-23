package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;

import base.UserMenu;
import java.awt.event.WindowEvent;
import users.Staff;

public class StaffView extends UserMenu {
    String[] test = { "Te", "te" };

    private int width = 240;
    private int height = 40;
    private String username;
    private String password;

    public StaffView(Staff staff) {
        super("Staff");
        setTitle("Staff Menu");
        Panel currentlyLoginAsPanel = new Panel(null);
        currentlyLoginAsPanel.setBounds(50, 100, 300, 100);
        Label currentlyLoginAs = new Label("Currently login as: Staff");
        currentlyLoginAs.setFont(new Font("Arial", Font.BOLD, 14));
        currentlyLoginAs.setBounds(20, 20, 200, 25);

        currentlyLoginAsPanel.add(currentlyLoginAs);
        Panel statsPanel = new Panel();
        statsPanel.setBackground(Color.gray);
        statsPanel.setBounds(50, 230, 700, 300);

        // left panel
        Panel leftSelectionPanel = new Panel(null);
        leftSelectionPanel.setBackground(Color.gray);
        leftSelectionPanel.setBounds(100, 260, 260, 250);

        Button registerUserButton = new Button("Register User");
        registerUserButton.setBounds(10, 0, width, height);
        leftSelectionPanel.add(registerUserButton);
        Button updateUserButton = new Button("Update User");
        updateUserButton.setBounds(10, 40, width, height);
        leftSelectionPanel.add(updateUserButton);
        Button makePaymentButton = new Button("Make Payment");
        makePaymentButton.setBounds(10, 80, width, height);
        leftSelectionPanel.add(makePaymentButton);
        Button generateReceiptButton = new Button("Generate Receipt");
        generateReceiptButton.setBounds(10, 120, width, height);
        leftSelectionPanel.add(generateReceiptButton);
        // Button totalButton = new Button("Total");
        // totalButton.setBounds(0, 200, 260, 40);
        // leftSelectionPanel.add(totalButton);

        // right panel
        Panel rightInfoPanel = new Panel(null);
        rightInfoPanel.setBackground(Color.white);
        rightInfoPanel.setBounds(450, 260, 260, 250);
        List detailList = new List();
        detailList.setBounds(0, 0, 260, 250);
        // add item 1 by 1 into list
        rightInfoPanel.add(detailList);

        add(currentlyLoginAsPanel);
        add(leftSelectionPanel);
        add(rightInfoPanel);
        add(statsPanel);

        setDetailList(detailList, test);

        // add button listener
        registerUserButton.addActionListener((e) -> {
            createRegisterDialog();

        });
        updateUserButton.addActionListener((e) -> {
        });
    }

    private void createRegisterDialog() {
        Dialog registerUserDialog = new Dialog(this, "Register User", true);
        registerUserDialog.setSize(300, 220);
        registerUserDialog.setLayout(null);
        registerUserDialog.setLocationRelativeTo(this);
        registerUserDialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                registerUserDialog.setVisible(false);
            }
        });
        Label dialogLabel = new Label("Register New User");
        dialogLabel.setBounds(100, 50, 150, 20);
        registerUserDialog.add(dialogLabel);

        Label usernameLabel = new Label("Username");
        usernameLabel.setBounds(70, 80, 150, 20);
        registerUserDialog.add(usernameLabel);

        TextField usernameTextField = new TextField();
        usernameTextField.setBounds(70, 100, 150, 20);
        registerUserDialog.add(usernameTextField);

        Label passwordLabel = new Label("Password");
        passwordLabel.setBounds(70, 120, 150, 20);
        registerUserDialog.add(passwordLabel);

        TextField passwordTextField = new TextField();
        passwordTextField.setBounds(70, 140, 150, 20);
        registerUserDialog.add(passwordTextField);

        Button registerButton = new Button("Register User");
        registerButton.setBounds(100, 170, 100, 30);
        registerUserDialog.add(registerButton);

        registerButton.addActionListener((e) -> {
            if (!usernameTextField.getText().isEmpty() && !passwordTextField.getText().isEmpty()) {
                username = usernameTextField.getText();
                password = passwordTextField.getText();
                try {
                    registerUserDialog.dispose();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });

        registerUserDialog.setVisible(true);
    }

}
