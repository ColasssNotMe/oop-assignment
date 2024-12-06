package base;

import java.awt.Button;
import java.awt.Label;
import java.awt.List;

import javax.swing.JFrame;

import font.AllFont;

public class UserMenu extends BaseFrame {
    double duePayment;
    String dueString = Double.toString(duePayment);

    public UserMenu(String username) {
        setLayout(null);
        JFrame root = getRoot();
        // Username display
        Label usernameLabel = new Label("Welcome, " + username);
        usernameLabel.setFont(AllFont.titleFont);
        usernameLabel.setBounds(50, 50, 300, 40);

        // Top right buttons
        Button logoutButton = new Button("Logout");
        logoutButton.setBounds(670, 50, 100, 40);

        Button editProfileButton = new Button("Edit Profile");
        editProfileButton.setBounds(540, 50, 100, 40);

        root.add(usernameLabel);
        root.add(logoutButton);
        root.add(editProfileButton);
    }

    public void setDetailList(List root, String[] dataList) {
        root.removeAll();
        for (String string : dataList) {
            root.add(string);
        }
    }

}
