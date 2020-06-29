package codegym.furama.controller;

import codegym.furama.model.customer.Customer;
import codegym.furama.model.services.DichVu;
import codegym.furama.service.DichVuSerVice;
import codegym.furama.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
public class ServiceControllers {
    @Autowired
    NewService newService;

    @Autowired
    DichVuSerVice dichVuSerVice;

    @GetMapping("/new-service")
    public ModelAndView getPageCreateService(){
        ModelAndView modelAndView = new ModelAndView("views/createService");
        modelAndView.addObject("dichVu", new DichVu());
        return  modelAndView;
    }
    @PostMapping("/new-service")
    public String saveNewService(@ModelAttribute("dichVu") DichVu dichVu){
        newService.save(dichVu);
        return "views/createService";
    }

    @GetMapping("/show-service")
    public ModelAndView showAllService(Pageable pageable){
        Page<DichVu> services = dichVuSerVice.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/views/show-all-service","listService",services);
        return modelAndView;
    }

    @GetMapping("/edit-service/{id}")
    public  ModelAndView editService(@PathVariable("id") int id ){
        Optional<DichVu> service = dichVuSerVice.findById(id);
        ModelAndView modelAndView = new ModelAndView("views/edit-service", "service",service);
        return modelAndView;
    }

    @PostMapping("/edit-service")
    public ModelAndView updateService(@ModelAttribute("service") DichVu service, @PageableDefault(value = 5) Pageable pageable){


        ModelAndView modelAndView = new ModelAndView("views/show-all-service");
        dichVuSerVice.save(service);
        Page<DichVu> listService = dichVuSerVice.findAll(pageable);

        modelAndView.addObject("listService", listService);
        modelAndView.addObject("message", " updated Service successfully");
        return modelAndView;
    }

    @GetMapping("delete-service/{id}")
    public String deleteService(@PathVariable("id") int id){
        dichVuSerVice.remove(id);
        return "redirect:/show-service";
    }



}
