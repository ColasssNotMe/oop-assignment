package base;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;

import font.AllFont;

public class UserMenu extends BaseFrame {
    double duePayment;
    String dueString = Double.toString(duePayment);

    public UserMenu(String username) {
        // if (extraInfo != null) {
        // return;
        // }
        setLayout(null);

        // Username display
        Label usernameLabel = new Label("Welcome, " + username);
        usernameLabel.setFont(AllFont.titleFont);
        usernameLabel.setBounds(50, 50, 300, 40);

        // Top right buttons
        Button logoutButton = new Button("Logout");
        logoutButton.setBounds(670, 50, 100, 40);

        Button editProfileButton = new Button("Edit Profile");
        editProfileButton.setBounds(540, 50, 100, 40);

        // Room
        Panel roomPanel = new Panel();
        roomPanel.setLayout(null);
        roomPanel.setBackground(new Color(240, 240, 240));
        roomPanel.setBounds(50, 100, 300, 100);

        Label roomLabel = new Label("Room Number:");
        roomLabel.setBounds(20, 20, 100, 25);
        roomLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        Label roomNumberLabel = new Label("A-123");
        roomNumberLabel.setBounds(130, 20, 100, 25);
        roomNumberLabel.setFont(new Font("Arial", Font.BOLD, 14));

        roomPanel.add(roomLabel);
        roomPanel.add(roomNumberLabel);

        // Payment
        Panel paymentPanel = new Panel();
        paymentPanel.setLayout(null);
        paymentPanel.setBackground(new Color(240, 240, 240));
        paymentPanel.setBounds(450, 100, 300, 100);

        Label paymentLabel = new Label("Payment Due:");
        paymentLabel.setBounds(20, 20, 100, 25);
        paymentLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        Label amountLabel = new Label();
        amountLabel.setBounds(130, 20, 100, 25);
        amountLabel.setFont(new Font("Arial", Font.BOLD, 14));

        Button paymentButton = new Button("Make Payment");
        paymentButton.setBounds(20, 60, 260, 30);

        paymentPanel.add(paymentLabel);
        paymentPanel.add(amountLabel);
        paymentPanel.add(paymentButton);

        Panel statsPanel = new Panel();
        statsPanel.setBackground(Color.gray);
        statsPanel.setBounds(50, 230, 700, 300);

        // inside panel
        // left panel
        Panel leftSelectionPanel = new Panel(null);
        leftSelectionPanel.setBackground(Color.white);
        leftSelectionPanel.setBounds(100, 260, 260, 250);

        Button laundryButton = new Button("Laundry Service");
        laundryButton.setBounds(0, 0, 260, 40);
        leftSelectionPanel.add(laundryButton);
        Button overDueButton = new Button("Overdue Payment");
        overDueButton.setBounds(0, 40, 260, 40);
        leftSelectionPanel.add(overDueButton);
        Button transportButton = new Button("Transport timetable");
        transportButton.setBounds(0, 80, 260, 40);
        leftSelectionPanel.add(transportButton);
        Button roomInfoButton = new Button("Room detail");
        roomInfoButton.setBounds(0, 120, 260, 40);
        leftSelectionPanel.add(roomInfoButton);

        // right panel
        Panel rightInfoPanel = new Panel(null);
        rightInfoPanel.setBackground(Color.white);
        rightInfoPanel.setBounds(450, 260, 260, 250);

        add(usernameLabel);
        add(logoutButton);
        add(editProfileButton);
        add(roomPanel);
        add(paymentPanel);
        add(leftSelectionPanel);
        add(rightInfoPanel);
        add(statsPanel);
    }
}