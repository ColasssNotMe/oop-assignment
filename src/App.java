import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import users.Resident;

public class App extends Frame {
    // public App() {
    // addWindowListener(new WindowAdapter() {
    // public void windowClosing(WindowEvent e) {
    // dispose();
    // }
    // });
    // }

    public static void main(String[] args) throws Exception {
        App f = new App();
        f.setSize(800, 600);
        f.setVisible(true);
        f.setResizable(false);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });
        Resident humana = new Resident(123, "pass", "name");

        System.out.println(humana.uid + humana.name + humana.password);
    }
}
