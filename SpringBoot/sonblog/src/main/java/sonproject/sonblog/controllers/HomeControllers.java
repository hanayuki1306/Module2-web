package sonproject.sonblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sonproject.sonblog.model.User.Login;
import sonproject.sonblog.model.User.User;
import sonproject.sonblog.model.User.UserDTO;
import sonproject.sonblog.service.UserService;

import java.util.Optional;

@Controller
public class HomeControllers {
    @Autowired
    UserService userService;


    @GetMapping("/")
        public String getViewsHomePage(){
        return "homeViews/home";
    }

    @GetMapping("/login")
    public ModelAndView showLogin(){
        ModelAndView modelAndView=new ModelAndView("homeViews/login");
        modelAndView.addObject("login",new Login());
        return modelAndView;
    }
    @PostMapping("/checklogin")
    public String checkLogin(@ModelAttribute("login") Login login){
        return userService.checkLogin(login);
    }


        @GetMapping("/show_all_User")
    public ModelAndView showAllUser(){
        Iterable<User> ListUser = userService.findAll();
        ModelAndView modelAndView = new ModelAndView("homeViews/listUser");
        modelAndView.addObject("listUser", ListUser);
        return  modelAndView;
    }

    @GetMapping("/edit-user/{id}")
    public ModelAndView editUser(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView("homeViews/editUser");
        Optional<User> user = userService.findById(id);
        modelAndView.addObject("user", user);
//        modelAndView.addObject("message", "add success");
        return modelAndView;
    }
    @PostMapping("/edit-user")
    public ModelAndView updateUser(@ModelAttribute("user") UserDTO user){
        userService.save(user);
        ModelAndView modelAndView = new ModelAndView("homeViews/editUser");
        modelAndView.addObject("user", user);
        modelAndView.addObject("message", "User updated successfully");
        return modelAndView;
    }
    @GetMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable("id") Long id){
            userService.remove(id);
        return "redirect:/show_all_User";

    }

    @GetMapping("/create_user")
    public  ModelAndView createPage(){
        ModelAndView modelAndView  = new ModelAndView("/homeViews/createUser");
        modelAndView.addObject("newUser",new UserDTO());
        return modelAndView;
    }
    @PostMapping("/create_user")
        public ModelAndView successCreatePage(@ModelAttribute("newUser") UserDTO user){
        userService.save(user);
        ModelAndView modelAndView = new ModelAndView("/homeViews/listUser","message","Created successfully!!");
        modelAndView.addObject("listUser", userService.findAll());
        return modelAndView;
    }

}
