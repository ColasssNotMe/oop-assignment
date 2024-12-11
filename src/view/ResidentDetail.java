package view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import base.BaseFrame;

public class ResidentDetail extends BaseFrame {
    public ResidentDetail(int id) {
        JFrame root = getRoot();

        root.setSize(400, 300);
        JLabel detaiLabel = new JLabel("Details");
        detaiLabel.setBounds(150, -50, 200, 200);
        detaiLabel.setSize(200, 200);
        detaiLabel.setFont(new Font("Comic Sans",Font.PLAIN, 30));
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 90, 100, 100);
        root.add(nameLabel);
root.add(detaiLabel);
    };
}
