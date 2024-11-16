package base;

import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionListener;

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

        add(usernameLabel);
        add(logoutButton);
        add(editProfileButton);
    }

    public void setDetailList(List root, String[] dataList) {
        root.removeAll();
        for (String string : dataList) {
            root.add(string);
        }
    }

}
