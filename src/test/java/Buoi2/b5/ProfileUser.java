package Buoi2.b5;

public class ProfileUser {

    private String name;

    public ProfileUser(String name) {
        this.name = name;
    }

    public String getName() {
        if (name == null) {
            throw new NullPointerException("Tên người dùng không tồn tại!");
        }
        return name;
    }
}
