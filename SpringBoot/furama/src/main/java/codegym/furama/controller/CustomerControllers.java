package codegym.furama.controller;


import codegym.furama.model.contract.HopDongDTO;
import codegym.furama.model.customer.Customer;
import codegym.furama.model.customer.CustomerDTO;
import codegym.furama.model.services.DichVu;

import codegym.furama.repository.CustomerRepository;
import codegym.furama.service.ContractService;
import codegym.furama.service.CustomerService;
import codegym.furama.service.NewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerControllers {


    @Autowired
    CustomerService customerService;





    @GetMapping("/show-customers")
    public ModelAndView pageCustomer(@PageableDefault(value = 5) Pageable pageable){
        Page<Customer>  listCustomers =customerService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("views/show-all-customers","customersList", listCustomers);
        return modelAndView;
    }

    @GetMapping("/edit-customer/{id}")
    public  ModelAndView editCustomer(@PathVariable("id") int id ){
        Optional<Customer>  customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("views/edit-customer", "customer",customer);

        return modelAndView;
    }
    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer,@PageableDefault(value = 5) Pageable pageable){


        ModelAndView modelAndView = new ModelAndView("views/show-all-customers");
        customerService.save(customer);
        Page<Customer> listCustomer = customerService.findAll(pageable);

        modelAndView.addObject("customersList", listCustomer);
        modelAndView.addObject("message", "User updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-customer/{id}")
    public String deleteCustomer(@PathVariable("id") int id) {
        customerService.remove(id);
        return "redirect:/show-customers";
    }


    @GetMapping("/find-customer")
    public ModelAndView pageCustomer(@RequestParam(name="findName")String name,Pageable pageable){
        Page<Customer> customers = customerService.findByName(name,pageable);
        ModelAndView modelAndView = new ModelAndView("views/show-all-customers","customersList",customers);
        return  modelAndView;
    };

}
