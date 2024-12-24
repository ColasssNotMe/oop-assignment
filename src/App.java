import view.MainMenu;
import view.ManagerView;
import view.ResidentView;
import view.StaffView;

public class App {

    public static void main(String[] args) throws Exception {
        // new ManagerView(null);
        new MainMenu();
        new ResidentView(null);
        new StaffView(null);
        new ManagerView(null);
    }
}
