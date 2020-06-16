package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeControllers {
    @GetMapping("/")
    public String homePage(){
        return "index";
    }
    @PostMapping("/save")
    public String saveElement(Model model,@RequestParam(name="giavi",required = false) String[] element){

        model.addAttribute("element",element);
        model.addAttribute("message", "saved");
        return "save";
    }
}
