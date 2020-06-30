package codegym.furama.controller;


import codegym.furama.model.services.DichVu;
import codegym.furama.model.services.ServiceQueue;
import codegym.furama.service.DichVuSerVice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class BookingControllers {
    @Autowired
    DichVuSerVice dichVuSerVice;

    @GetMapping("/booking-service")
    public ModelAndView getBookingPage(Pageable pageable){
        Page<DichVu> services = dichVuSerVice.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("views/booking-service","servicequeue", new ServiceQueue());
        modelAndView.addObject("listService",services);
        return modelAndView;
    };
}
