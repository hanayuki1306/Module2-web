package sonproject.sonblog.model.User;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 30)
    @Column(name = "name")
    private String name;

    @Column(name = "user_account")
    private String account;

    @Column(name = "password")
    private String password;

    @Min(10)
    @Column(name = "age")
    private String age;
    @Column(name = "permission")
    public Permission permission = Permission.user;
//    private String permission;

    public User() {
    }


    public User(Long id, String name, String password, String age, Permission permission, String account) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.permission = permission;
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAccount() {
        return account;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

//    public Permission getPermission() {
//        return permission;
//    }
//
//    public void setPermission(Permission permission) {
//        this.permission = permission;
//    }
//    public String getAccount() {
//        return account;
//    }

    public void setAccount(String account) {
        this.account = account;
    }

}


