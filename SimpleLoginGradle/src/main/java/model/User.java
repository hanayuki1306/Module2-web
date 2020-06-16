package model;

public class User {
    private String name;
    private  String password;
    private String image;
    private int old;
    private String address;
    public User() {
    }

    public User(String name, String password, String image, int old, String address) {
        this.name = name;
        this.password = password;
        this.image = image;
        this.old = old;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
