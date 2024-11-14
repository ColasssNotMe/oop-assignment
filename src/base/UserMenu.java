package base;

import java.awt.Button;
import java.awt.Label;

import font.AllFont;

public class UserMenu extends BaseFrame {
    public UserMenu() {
        // TODO: call the readData function
        // String username = getUsername(data);
        String username = "test";
        Label usernameLabel = new Label(username);
        usernameLabel.setFont(AllFont.titleFont);
        usernameLabel.setBounds(1, 2, 2, 2);

        Button logoutButton = new Button("Logout");
        logoutButton.setBounds(670, 60, 100, 40);

        add(logoutButton);

    };
}
