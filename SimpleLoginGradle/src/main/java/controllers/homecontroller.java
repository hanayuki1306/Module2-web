package controllers;

import model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homecontroller {
    @GetMapping("/")
        public String homepage(){
        return "index";
    };

    @RequestMapping( value="/login", method = RequestMethod.GET)
    public ModelAndView homelogin(){
        ModelAndView modelAndView = new ModelAndView("login", "login", new Login());
        return modelAndView;
        }
    }
}
