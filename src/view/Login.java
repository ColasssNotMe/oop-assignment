package view;

import java.awt.Label;
import util.WindowListenerImp;

// ...existing imports...

public class Login extends BaseFrame {

    public Login() {
        super();
        System.out.println("Login rendered");
        setTitle("Login");
        setVisible(true);
        setLayout(null);

        Label username = new Label("Username");
        Label password = new Label("Password");

        add(username, password);

        addWindowListener(new WindowListenerImp());
    }
}