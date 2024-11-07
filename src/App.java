import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import view.MainMenu;

public class App {

    public static void main(String[] args) throws Exception {
        MainMenu mainMenu = new MainMenu();

        // enable window closing
        mainMenu.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                mainMenu.dispose();
            }
        });
        // Label title = new Label("Main menu", Label.CENTER);
        // Font font = new Font("Arial", Font.PLAIN, 48);
        // title.setFont(font);
        // mainMenu.add(title);
    }
}
