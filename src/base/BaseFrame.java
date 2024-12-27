package base;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import color.CustomColor;

public class BaseFrame extends Frame {
    JFrame root = new JFrame();

    public BaseFrame() {
        root.setSize(800, 600);
        root.setResizable(false);
        root.setVisible(true);
        root.getContentPane().setBackground(CustomColor.BACKGROUND_COLOR);
        root.setLayout(null);
        root.setLocation(500, 250);

        addWindowListener(new WindowListenerImp());

    }

    public JFrame getRoot() {
        return root;
    }

    public JTextField createStyledTextField() {
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        textField.setForeground(CustomColor.TEXT_COLOR);
        textField.setBorder(new LineBorder(CustomColor.BORDER_COLOR, 2, true));
        return textField;
    }

    public JButton createStyledButton(String text, boolean isPrimary) {
        JButton button = new JButton(text);
        button.setFont(new Font("Segoe UI", Font.BOLD, 16));

        if (isPrimary) {
            button.setBackground(CustomColor.PRIMARY_COLOR);
            button.setForeground(Color.WHITE);
        } else {
            button.setBackground(CustomColor.CONTAINER_BACKGROUND);
            button.setForeground(CustomColor.TEXT_COLOR);
            button.setBorder(new LineBorder(CustomColor.BORDER_COLOR, 1, true));
        }

        return button;
    }

    public void addPlaceholderEffect(JTextField textField, String placeholder) {
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(CustomColor.TEXT_COLOR);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
    }

}
