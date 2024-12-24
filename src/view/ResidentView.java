package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;

import javax.swing.JFrame;

import base.UserMenu;
import color.CustomColor;
import font.AllFont;
import users.User;

public class ResidentView extends UserMenu {
    static String[] test = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };
    static String[] test2 = { "Bpple", "Banana", "Cherry", "Date", "Elderberry" };
    static String[] test3 = { "Cpple", "Banana", "Cherry", "Date", "Elderberry" };

    private int width = 240;
    private int height = 40;
    // private Resident resident;

    public ResidentView(User user) {
        super("Resident");
        JFrame root = getRoot();
        setTitle("Resident Menu");
        Panel roomPanel = new Panel();
        roomPanel.setLayout(null);
        roomPanel.setBackground(CustomColor.BACKGROUND_COLOR);
        roomPanel.setBounds(50, 100, 300, 100);

        Label roomLabel = new Label("Room Number:");
        roomLabel.setBounds(20, 20, 100, 25);
        roomLabel.setFont(AllFont.LABEL_TEXT);

        Label roomNumberLabel = new Label("A-123");
        roomNumberLabel.setBounds(130, 20, 100, 25);
        roomNumberLabel.setFont(AllFont.LABEL_TEXT);

        roomPanel.add(roomLabel);
        roomPanel.add(roomNumberLabel);
        // Payment
        Panel paymentPanel = new Panel();
        paymentPanel.setLayout(null);
        paymentPanel.setBackground(CustomColor.BACKGROUND_COLOR);
        paymentPanel.setBounds(450, 100, 300, 100);

        Label paymentLabel = new Label("Payment Due:");
        paymentLabel.setBounds(20, 20, 100, 25);
        paymentLabel.setFont(AllFont.LABEL_TEXT);

        Label amountLabel = new Label();
        amountLabel.setBounds(130, 20, 100, 25);
        amountLabel.setFont(AllFont.LABEL_TEXT);

        Button paymentButton = new Button("Make Payment");
        paymentButton.setBounds(20, 60, 260, 30);

        paymentPanel.add(paymentLabel);
        paymentPanel.add(amountLabel);
        paymentPanel.add(paymentButton);

        Panel statsPanel = new Panel();
        statsPanel.setBackground(CustomColor.BACKGROUND_COLOR);
        statsPanel.setBounds(50, 230, 700, 300);

        // inside panel
        // left panel
        Panel leftSelectionPanel = new Panel(null);
        leftSelectionPanel.setBackground(CustomColor.CONTAINER_BACKGROUND);
        leftSelectionPanel.setBounds(100, 260, 260, 250);

        Button overDueButton = new Button("Overdue Payment");
        overDueButton.setBounds(10, 0, width, height);
        leftSelectionPanel.add(overDueButton);
        Button roomInfoButton = new Button("Room detail");
        roomInfoButton.setBounds(10, 40, width, height);
        leftSelectionPanel.add(roomInfoButton);
        Button totalButton = new Button("Total");
        totalButton.setBounds(0, 200, 260, 40);
        leftSelectionPanel.add(totalButton);

        // right panel
        Panel rightInfoPanel = new Panel(null);
        rightInfoPanel.setBackground(CustomColor.CONTAINER_BACKGROUND);
        rightInfoPanel.setBounds(450, 260, 260, 250);
        List detailList = new List();
        detailList.setBounds(0, 0, 260, 250);
        // add item 1 by 1 into list
        setDetailList(detailList, test);
        rightInfoPanel.add(detailList);

        root.add(roomPanel);
        root.add(paymentPanel);
        root.add(leftSelectionPanel);
        root.add(rightInfoPanel);
        root.add(statsPanel);

        overDueButtonListener(overDueButton, detailList, test2);
        roomInfoButtonListener(roomInfoButton, detailList, test2);
        totalButtonListener(totalButton, detailList, test);
    };

    public void laundryButtonListener(Button laundryButton, List detailList, String[] dataList) {
        laundryButton.addActionListener((e) -> setDetailList(detailList, dataList));
    }

    public void overDueButtonListener(Button overDueButton, List detailList, String[] dataList) {
        overDueButton.addActionListener((e) -> setDetailList(detailList, dataList));
    }

    public void transportButtonListener(Button transportButton, List detailList, String[] dataList) {
        transportButton.addActionListener((e) -> setDetailList(detailList, dataList));
    }

    public void roomInfoButtonListener(Button roomInfoButton, List detailList, String[] dataList) {
        roomInfoButton.addActionListener((e) -> setDetailList(detailList, dataList));
    }

    public void totalButtonListener(Button totalButton, List detailList, String[] dataList) {
        totalButton.addActionListener((e) -> setDetailList(detailList, dataList));
    }

}
