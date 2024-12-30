package base;

import java.awt.Font;
import java.awt.Label;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import font.AllFont;
import users.User;
import users.User.Role;
import view.MainMenu;

public class UserMenu extends BaseFrame {
    double duePayment;
    String dueString = Double.toString(duePayment);

    public UserMenu(User user) {
        setLayout(null);
        String username = user.name;
        JFrame root = getRoot();
        // Username display
        Label usernameLabel = new Label("Welcome, " + username);
        usernameLabel.setFont(AllFont.LABEL_TEXT);
        usernameLabel.setBounds(50, 50, 300, 40);
        if (user.role.equals(Role.manager) || user.role.equals(Role.staff)) {
            JLabel currentRole = new JLabel("Currently login as: " + user.role);
            currentRole.setFont(new Font("Segoe UI", Font.BOLD, 18));
            currentRole.setBounds(50, 100, 300, 40);
            root.add(currentRole);
        }
        // Top right buttons
        JButton logoutButton = createStyledButton("Logout", true);
        logoutButton.setBounds(650, 50, 100, 40);

        JButton editProfileButton = createStyledButton("Edit Profile", false);
        editProfileButton.setBounds(520, 50, 100, 40);

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
