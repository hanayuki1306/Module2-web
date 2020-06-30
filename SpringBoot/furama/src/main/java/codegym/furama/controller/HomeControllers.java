package codegym.furama.controller;

import codegym.furama.model.customer.CustomerDTO;
import codegym.furama.model.customer.Login;
import codegym.furama.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeControllers {
    @Autowired
    CustomerService customerService;


    @GetMapping("/login")
    public ModelAndView getLogin() {
        ModelAndView modelAndView = new ModelAndView("views/homelogin");
        modelAndView.addObject("loginObj", new Login());
        return modelAndView;
    }

    @PostMapping("/login")
    public String checkLogin(@ModelAttribute("loginObj") Login loginObj){
        return customerService.checkLogin(loginObj);
    }


    @GetMapping("/")
    public String getHomePage(){
        return "/views/homepage";
    }
    @GetMapping("/register")
    public ModelAndView getRegisterPage(){
        ModelAndView modelAndView = new ModelAndView("/views/register");
        modelAndView.addObject("customer", new CustomerDTO());
        return modelAndView;
    }
    @PostMapping("/register")
    public String saveCustomer(@Validated @ModelAttribute("customer") CustomerDTO customer, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        new CustomerDTO().validate(customer,bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "views/register";
        }
        customerService.saveDTO(customer);
        redirectAttributes.addFlashAttribute("message","create success");
        return "redirect:/login";
    }
}
