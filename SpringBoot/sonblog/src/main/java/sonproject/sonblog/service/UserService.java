package sonproject.sonblog.service;

import sonproject.sonblog.model.User.Login;
import sonproject.sonblog.model.User.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(Long id);
    void save(User user);

    void remove(Long id);
    String checkLogin(Login login);

}
