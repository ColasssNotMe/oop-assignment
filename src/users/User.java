package users;

public class User {
    public String name;
    public String password;
    public int uid;
    public String userType;

    public User(int uid, String password, String name, String userType) {
        this.uid = uid;
        this.password = password;
        this.name = name;
        this.userType = userType;
    }
}
