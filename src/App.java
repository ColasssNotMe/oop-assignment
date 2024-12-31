
import users.User;
import users.User.Role;
import view.MainMenu;
import view.View;

public class App {

    public static void main(String[] args) throws Exception {
        int id = 1;
        String firstName = "John";
        String urgentContact = "123123";
        String ic = "test";
        String password = "password123";
        String phoneNumber = "1234567890";
        String gender = "Male";
        Role role = Role.manager;

        User testUser = new User(id, firstName, password, phoneNumber, ic, gender, urgentContact, role);
        // new View(testUser);
        new View(testUser);
    }
}
