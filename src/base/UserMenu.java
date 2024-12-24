package base;

import java.awt.Button;
import java.awt.Label;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import font.AllFont;
import view.MainMenu;

public class UserMenu extends BaseFrame {
    double duePayment;
    String dueString = Double.toString(duePayment);

    public UserMenu(String username) {
        setLayout(null);
        JFrame root = getRoot();
        // Username display
        Label usernameLabel = new Label("Welcome, " + username);
        usernameLabel.setFont(AllFont.LABEL_TEXT);
        usernameLabel.setBounds(50, 50, 300, 40);

        // Top right buttons
        Button logoutButton = new Button("Logout");
        logoutButton.setBounds(670, 50, 100, 40);

        Button editProfileButton = new Button("Edit Profile");
        editProfileButton.setBounds(540, 50, 100, 40);

        root.add(usernameLabel);
        root.add(logoutButton);
        root.add(editProfileButton);

        logoutButton.addActionListener(e -> {
            int confirmationDialog = JOptionPane.showConfirmDialog(root, "Logout?");
            if (confirmationDialog == 0) {
                root.dispose();
                new MainMenu();
            }
        });
    }

    public void setDetailList(List root, String[] dataList) {
        root.removeAll();
        for (String string : dataList) {
            root.add(string);
        }
    }

}
