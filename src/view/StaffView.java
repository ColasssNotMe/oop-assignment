package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;

import base.UserMenu;

public class StaffView extends UserMenu {
    String[] test = { "Te", "te" };

    private int width = 240;
    private int height = 40;

    public StaffView() {
        super("Staff");
        setTitle("Staff Menu");
        Panel currentlyLoginAsPanel = new Panel(null);
        currentlyLoginAsPanel.setBounds(50, 100, 300, 100);
        Label currentlyLoginAs = new Label("Currently login as: Manager");
        currentlyLoginAs.setFont(new Font("Arial", Font.BOLD, 14));
        currentlyLoginAs.setBounds(20, 20, 200, 25);

        currentlyLoginAsPanel.add(currentlyLoginAs);

        // left panel
        Panel leftSelectionPanel = new Panel(null);
        leftSelectionPanel.setBackground(Color.lightGray);
        leftSelectionPanel.setBounds(100, 260, 260, 250);

        Button laundryButton = new Button("Laundry Service");
        laundryButton.setBounds(10, 0, width, height);
        leftSelectionPanel.add(laundryButton);
        Button overDueButton = new Button("Overdue Payment");
        overDueButton.setBounds(10, 40, width, height);
        leftSelectionPanel.add(overDueButton);
        Button transportButton = new Button("Transport timetable");
        transportButton.setBounds(10, 80, width, height);
        leftSelectionPanel.add(transportButton);
        Button roomInfoButton = new Button("Room detail");
        roomInfoButton.setBounds(10, 120, width, height);
        leftSelectionPanel.add(roomInfoButton);
        Button totalButton = new Button("Total");
        totalButton.setBounds(0, 200, 260, 40);
        leftSelectionPanel.add(totalButton);

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

        setDetailList(detailList, test);
    }
}
