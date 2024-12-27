package users;

public class User {
    public int id;
    public String name;
    public String password;
    public String ic;
    public String gender;
    public int contact;
    public int urgentContact;
    public Role role;

    public enum Role {
        resident, staff, manager
    }

    public User(int id, String name, String password, int contact, String ic, String gender, int urgentContact,
            Role role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.contact = contact;
        this.role = role;
        this.ic = ic;
        this.gender = gender;
        this.urgentContact = urgentContact;
    }
}
