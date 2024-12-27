package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import base.UserMenu;
import color.CustomColor;
import font.AllFont;
import users.User;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StaffView extends UserMenu {
    String[] test = { "Te", "te" };

    private int width = 240;
    private int height = 40;

    public StaffView(User user) {
        super("Staff");
        JFrame root = getRoot();
        setTitle("Staff Menu");
        Panel currentlyLoginAsPanel = new Panel(null);
        currentlyLoginAsPanel.setBounds(50, 100, 300, 100);
        Label currentlyLoginAs = new Label("Currently login as: Staff");
        currentlyLoginAs.setFont(AllFont.LABEL_TEXT);
        currentlyLoginAs.setBounds(20, 20, 200, 25);

        currentlyLoginAsPanel.add(currentlyLoginAs);
        Panel statsPanel = new Panel();
        statsPanel.setBackground(CustomColor.CONTAINER_BACKGROUND);
        statsPanel.setBounds(50, 230, 700, 300);

        // left panel
        Panel leftSelectionPanel = new Panel(null);
        leftSelectionPanel.setBackground(CustomColor.CONTAINER_BACKGROUND);
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

        // right panel
        Panel rightInfoPanel = new Panel(null);
        rightInfoPanel.setBackground(CustomColor.CONTAINER_BACKGROUND);
        rightInfoPanel.setBounds(450, 260, 260, 250);
        List detailList = new List();
        detailList.setBounds(0, 0, 260, 250);
        // add item 1 by 1 into list
        rightInfoPanel.add(detailList);

        root.add(currentlyLoginAsPanel);
        root.add(leftSelectionPanel);
        root.add(rightInfoPanel);
        root.add(statsPanel);
        setDetailList(detailList, test);

        // add button listener
        registerUserButton.addActionListener((e) -> {
            createRegisterDialog();

        });
        updateUserButton.addActionListener((e) -> {
        });
    }

    private void createRegisterDialog() {
        String newUsername = JOptionPane.showInputDialog("Enter username:");
        if (newUsername == null) {
            // JOptionPane.showMessageDialog(UserMenu.root,"Username cannot be empty");
        }
        String newPassword = JOptionPane.showInputDialog("Enter new password");
    }

}
