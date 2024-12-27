import users.User;
import users.User.Role;
import view.View;

public class App {

    public static void main(String[] args) throws Exception {
        int id = 1;
        String firstName = "John";
        int urgentContact = 123123;
        String ic = "test";
        String password = "password123";
        int phoneNumber = 1234567890;
        String gender = "Male";
        Role role = Role.staff;

        User testUser = new User(id, firstName, password, phoneNumber, ic, gender, urgentContact, role);
        // new ManagerView(null);
        new View(testUser);
    }
}
