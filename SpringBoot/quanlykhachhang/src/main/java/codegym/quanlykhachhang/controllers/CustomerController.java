//package codegym.quanlykhachhang.controllers;
//
//import codegym.quanlykhachhang.model.Customer;
//import codegym.quanlykhachhang.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//
//import java.util.List;
//
//@Controller
//
//public class CustomerController {
//    @Autowired
//    CustomerService customerService;
//    @GetMapping("/")
//    public ModelAndView listCustomers(){
//        List<Customer> customers = customerService.findAll();
//        ModelAndView modelAndView = new ModelAndView("/customers/list");
//        modelAndView.addObject("customers", customers);
//        return modelAndView;
//    }
//
//    @GetMapping("/create-customer")
//    public ModelAndView showCreateForm(){
//        ModelAndView modelAndView = new ModelAndView("/customers/create");
//        modelAndView.addObject("customer", new Customer());
//        return modelAndView;
//    }
//
//    @PostMapping("/create-customer")
//    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
//        customerService.save(customer);
//
//        ModelAndView modelAndView = new ModelAndView("/customers/create");
//        modelAndView.addObject("customer", new Customer());
//        modelAndView.addObject("message", "New customer created successfully");
//        return modelAndView;
//    }
//
//
//
//    @GetMapping("/edit-customer/{id}")
//    public ModelAndView viewEditCustomer(@PathVariable Long id){
//        Customer customer = customerService.findById(id);
//        if(customer != null) {
//            ModelAndView modelAndView = new ModelAndView("/customers/edit");
//            modelAndView.addObject("customer", customer);
//            return  modelAndView;
//        } else {
//            ModelAndView modelAndView = new ModelAndView("/customers/error");
//            return  modelAndView;
//        }
//    }
//
//    @PostMapping("/edit-customers")
//    public ModelAndView edit(@ModelAttribute() Customer customer){
//        ModelAndView modelAndView = new ModelAndView("/customers/edit");
//        customerService.save(customer);
//        modelAndView.addObject("message", "Edit completed");
//        return  modelAndView;
//    }
//
//
//
//    @GetMapping("/delete-customer/{id}")
//    public ModelAndView showDeleteForm(@PathVariable Long id){
//        Customer customer = customerService.findById(id);
//        if(customer != null) {
//            ModelAndView modelAndView = new ModelAndView("/customers/delete");
//            modelAndView.addObject("customers", customer);
//            return modelAndView;
//
//        }else {
//            ModelAndView modelAndView = new ModelAndView("customers/error");
//            return modelAndView;
//        }
//    }
//
//    @PostMapping("/delete-customer")
//    public ModelAndView deleteCustomer(@ModelAttribute("customer") Customer customer){
//        ModelAndView modelAndView = new ModelAndView("redirect:/");
//        customerService.remove(customer.getId());
//        return  modelAndView;
//    }
//
//}