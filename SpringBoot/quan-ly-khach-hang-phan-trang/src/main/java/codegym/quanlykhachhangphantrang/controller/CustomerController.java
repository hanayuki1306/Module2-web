package codegym.quanlykhachhangphantrang.controller;

import codegym.quanlykhachhangphantrang.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import codegym.quanlykhachhangphantrang.repository.CustomerRepository;

import org.springframework.data.domain.Pageable;
@Controller
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    public ModelAndView listCustomers(@PageableDefault(value = 3) Pageable pageable){
        Page<Customer> customers = customerRepository.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
