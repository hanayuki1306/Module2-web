package codegym.furama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeControllers {
    @GetMapping("/")
    public String getHomePage(){
        return "views/home";
    }
}
