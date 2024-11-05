package view;

import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;

public class MainMenu extends BaseFrame {
    public MainMenu() {
        super();
        setTitle("Main Menu");
        setVisible(true);
        Label titleText = new Label("Main Menu");
        Panel titlePanel = new Panel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        Font titleFont = new Font("Arial", Font.PLAIN, 36);
        titleText.setFont(titleFont);
        titlePanel.add(titleText);
        add(titlePanel);
    }

}
