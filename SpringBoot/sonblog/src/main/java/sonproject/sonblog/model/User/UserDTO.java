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

}
