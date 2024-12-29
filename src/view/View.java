package view;

import java.awt.Label;
import java.awt.List;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import base.UserMenu;
import color.CustomColor;
import font.AllFont;
import users.User;
import users.User.Role;

public class View extends UserMenu {

    static String[] test = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };
    static String[] test2 = { "Bpple", "Banana", "Cherry", "Date", "Elderberry" };
    static String[] test3 = { "Cpple", "Banana", "Cherry", "Date", "Elderberry" };

    private int width = 240;
    private int height = 40;
    // private Resident resident;

    public View(User user) {
        super(user.name);
        JFrame root = getRoot();
        switch (user.role) {
            case resident:
                setTitle("Resident");
                break;
            case manager:
                setTitle("Manager");
                break;
            case staff:
                setTitle("Staff");
                break;
        }

        Panel roomPanel = new Panel();
        roomPanel.setLayout(null);
        roomPanel.setBackground(CustomColor.BACKGROUND_COLOR);
        roomPanel.setBounds(50, 100, 300, 100);

        Panel statsPanel = new Panel();
        statsPanel.setBackground(CustomColor.BACKGROUND_COLOR);
        statsPanel.setBounds(50, 230, 700, 300);

        if (user.role.equals(Role.resident)) {
            Label roomLabel = new Label("Room Number:");
            roomLabel.setBounds(21, 20, 100, 25);
            roomLabel.setFont(AllFont.LABEL_TEXT);
            Label roomNumberLabel = new Label("A-123");
            roomNumberLabel.setBounds(130, 20, 100, 25);
            roomNumberLabel.setFont(AllFont.LABEL_TEXT);
            roomPanel.add(roomLabel);
            roomPanel.add(roomNumberLabel);
            Label paymentLabel = new Label("Payment Due:");
            paymentLabel.setBounds(20, 20, 100, 25);
            paymentLabel.setFont(AllFont.LABEL_TEXT);

            Label amountLabel = new Label();
            amountLabel.setBounds(130, 20, 100, 25);
            amountLabel.setFont(AllFont.LABEL_TEXT);
            // Payment
            Panel paymentPanel = new Panel();
            paymentPanel.setLayout(null);
            paymentPanel.setBackground(CustomColor.BACKGROUND_COLOR);
            paymentPanel.setBounds(450, 100, 300, 100);

            JButton paymentButton = new JButton("Make Payment");
            paymentButton.setBounds(20, 60, 260, 30);

            paymentPanel.add(paymentLabel);
            paymentPanel.add(amountLabel);
            paymentPanel.add(paymentButton);
            root.add(paymentPanel);

        } else if (user.role.equals(Role.staff)) {

        }

        Panel leftSelectionPanel = new Panel(null);
        leftSelectionPanel.setBackground(CustomColor.CONTAINER_BACKGROUND);
        leftSelectionPanel.setBounds(100, 260, 260, 250);

        Panel rightInfoPanel = new Panel(null);
        rightInfoPanel.setBackground(CustomColor.CONTAINER_BACKGROUND);
        rightInfoPanel.setBounds(450, 260, 260, 250);

        List detailList = new List();
        detailList.setBounds(0, 0, 260, 250);

        if (user.role.equals(Role.resident)) {
            // left panel
            JButton overDueButton = new JButton("Overdue Payment");
            overDueButton.setBounds(10, 0, width, height);
            leftSelectionPanel.add(overDueButton);
            JButton roomInfoButton = new JButton("Room detail");
            roomInfoButton.setBounds(10, 40, width, height);
            leftSelectionPanel.add(roomInfoButton);
            JButton totalButton = new JButton("Total");
            totalButton.setBounds(0, 200, 260, 40);
            leftSelectionPanel.add(totalButton);

            // right panel
            // add item 1 by 1 into list
            setDetailList(detailList, test);
            rightInfoPanel.add(detailList);

            root.add(roomPanel);
            overDueButtonListener(overDueButton, detailList, test2);
            roomInfoButtonListener(roomInfoButton, detailList, test2);
            totalButtonListener(totalButton, detailList, test);
        } else if (user.role.equals(Role.staff)) {
            JButton registerUserButton = new JButton("Register User");
            registerUserButton.setBounds(10, 0, width, height);
            leftSelectionPanel.add(registerUserButton);
            JButton updateUserButton = new JButton("Update User");
            updateUserButton.setBounds(10, 40, width, height);
            leftSelectionPanel.add(updateUserButton);
            JButton makePaymentButton = new JButton("Make Payment");
            makePaymentButton.setBounds(10, 80, width, height);
            leftSelectionPanel.add(makePaymentButton);
            JButton generateReceiptButton = new JButton("Generate Receipt");
            generateReceiptButton.setBounds(10, 120, width, height);
            leftSelectionPanel.add(generateReceiptButton);

            // add item 1 by 1 into list
            rightInfoPanel.add(detailList);
            // add button listener
            registerUserButton.addActionListener((e) -> {
                createRegisterDialog();

            });
            updateUserButton.addActionListener((e) -> {
            });
        } else if (user.role.equals(Role.manager)) {
            JButton showResidentButton = new JButton("Show Resident List");
            showResidentButton.setBounds(10, 0, width, height);
            leftSelectionPanel.add(showResidentButton);
            JButton roomInfoButton = new JButton("Room detail");
            roomInfoButton.setBounds(10, 40, width, height);
            leftSelectionPanel.add(roomInfoButton);
            JButton totalButton = new JButton("Total");
            totalButton.setBounds(0, 200, 260, 40);
            leftSelectionPanel.add(totalButton);
        }
        root.add(leftSelectionPanel);
        root.add(rightInfoPanel);
        root.add(statsPanel);
        setDetailList(detailList, test);

        detailList.addActionListener(e -> {
           int selectedItem = detailList.getSelectedIndex();
           // TODO: search for the customer name
           // User selectedCustomerName = detailList.getItem(selectedItem);
           new ResidentDetailDialog(12,
                   new User(1, "name", "password", "01112840294", "ic", "gender", "12550298", Role.resident));
       });

   };

   public void laundryButtonListener(JButton laundryButton, List detailList, String[] dataList) {
       laundryButton.addActionListener((e) -> setDetailList(detailList, dataList));
   }

    public void overDueButtonListener(JButton overDueButton, List detailList, String[] dataList) {
        overDueButton.addActionListener((e) -> setDetailList(detailList, dataList));
    }

    public void transportButtonListener(JButton transportButton, List detailList, String[] dataList) {
        transportButton.addActionListener((e) -> setDetailList(detailList, dataList));
    }

    public void roomInfoButtonListener(JButton roomInfoButton, List detailList, String[] dataList) {
        roomInfoButton.addActionListener((e) -> setDetailList(detailList, dataList));
    }

    public void totalButtonListener(JButton totalButton, List detailList, String[] dataList) {
        totalButton.addActionListener((e) -> setDetailList(detailList, dataList));
    }

    private void createRegisterDialog() {
        String newUsername = JOptionPane.showInputDialog("Enter username:");
        if (newUsername == null) {
            // JOptionPane.showMessageDialog(UserMenu.root,"Username cannot be empty");
        }
        String newPassword = JOptionPane.showInputDialog("Enter new password");
    }

}
