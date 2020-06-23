package sonproject.sonblog.model.User;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDTO {
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 30)
    private String name;

    @Min(10)
    private String age;


    @NotEmpty
    @Size(min = 2, max = 30)
    private String account;


    @NotEmpty
    @Size(min = 2, max = 30)
    private String password;

    @NotEmpty
    @Size(min = 2, max = 30)
    private String confirmPassword;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public UserDTO() {
    }
}
