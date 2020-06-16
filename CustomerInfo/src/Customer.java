public class Customer {
    String name;
    String birthday;
    String address;
    String ImgUrl;

    public Customer() {
    }

    public Customer(String name, String birthday, String address, String imgUrl) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        ImgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }
}
