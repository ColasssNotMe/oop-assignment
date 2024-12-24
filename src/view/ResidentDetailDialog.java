package view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import base.BaseFrame;
import users.User;

public class ResidentDetailDialog extends BaseFrame {
    public ResidentDetailDialog(int id, User user) {
        JFrame root = getRoot();

        root.setSize(400, 300);
        JLabel detaiLabel = new JLabel("Details");
        detaiLabel.setBounds(150, -50, 200, 200);
        detaiLabel.setSize(200, 200);
        detaiLabel.setFont(new Font("Segoe UI", Font.PLAIN, 30));
        JLabel nameLabel = new JLabel("Name:" + user.name);
        nameLabel.setBounds(10, 90, 100, 100);
        root.add(nameLabel);
        root.add(detaiLabel);
    };
}
