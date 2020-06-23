package sonproject.sonblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sonproject.sonblog.model.User.Login;
import sonproject.sonblog.model.User.User;
import sonproject.sonblog.model.User.UserDTO;
import sonproject.sonblog.repository.UserRepository;
import sonproject.sonblog.service.UserService;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;



    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(UserDTO userDTO) {
//        userRepository.save()
      if (userDTO.getPassword().equals(userDTO.getConfirmPassword())){
            User user = new User();
            user.setName(userDTO.getName());
            user.setAge(userDTO.getAge());
            user.setAccount(userDTO.getAccount());
            user.setPassword(userDTO.getPassword());
            userRepository.save(user);
      }

    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }

    public String checkLogin(Login login){
        List<User> dbUser = userRepository.findAll();
        for (User user: dbUser){
            if (user.getAccount().equals(login.getAccount())&& user.getPassword().equals(login.getPassword())){
                return "homeViews/success";
            }
        }
        return "homeViews/error";
    }
}
