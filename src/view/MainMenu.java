package view;

import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JFrame;
import base.BaseFrame;
import base.WindowListenerImp;
import color.CustomColor;
import font.AllFont;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class MainMenu extends BaseFrame {
    // Color Palette

    public MainMenu() {
        super();
        JFrame root = getRoot();
        root.setTitle("Main Menu");
        root.getContentPane().setBackground(CustomColor.BACKGROUND_COLOR);

        // Panel
        Panel buttonPanel = new Panel(new GridLayout(2, 1, 100, 20));
        buttonPanel.setBackground(CustomColor.BACKGROUND_COLOR);
        buttonPanel.setBounds(300, 200, 200, 200);

        Panel titlePanel = new Panel(new FlowLayout());
        titlePanel.setBackground(CustomColor.BACKGROUND_COLOR);
        titlePanel.setBounds(300, 100, 200, 100);

        // init font and text
        Font titleFont = AllFont.TITLE_TEXT;
        Font buttonFont = AllFont.BUTTON_TEXT;

        Label titleText = new Label("Main Menu");
        titleText.setFont(titleFont);
        titleText.setForeground(CustomColor.TITLE_COLOR);

        // button init
        Button loginButton = new Button("Login");
        Button registerButton = new Button("Register");

        // Styling buttons
        styleButton(loginButton, buttonFont);
        styleButton(registerButton, buttonFont);

        // add
        titlePanel.add(titleText);
        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);
        root.add(titlePanel);
        root.add(buttonPanel);

        setupButtonListeners(loginButton, registerButton, root);

        root.addWindowListener(new WindowListenerImp());

        root.setLocation(500, 250);
        root.setVisible(true);
    }

    private void styleButton(Button button, Font font) {
        button.setFont(font);
        button.setBackground(CustomColor.BUTTON_BG_COLOR);
        button.setForeground(CustomColor.BUTTON_TEXT_COLOR);

        // Optional: Add hover effect (note: pure AWT has limited styling)
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(CustomColor.BUTTON_HOVER_COLOR);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(CustomColor.BUTTON_BG_COLOR);
            }
        });
    }

    private void setupButtonListeners(Button loginButton, Button registerButton, JFrame root) {
        loginButton.addActionListener(e -> {
            root.dispose();
            new Login();
        });

        registerButton.addActionListener(e -> {
            root.dispose();
            new Register();
        });
    }
}