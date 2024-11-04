package users;

public class User {
    public String name;
    public String password;
    public int uid;

    public User(int uid, String password, String name) {
        this.uid = uid;
        this.password = password;
        this.name = name;
    }
}
