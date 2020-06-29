package codegym.furama.controller;


import codegym.furama.model.contract.HopDongDTO;
import codegym.furama.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContractControllers {
    @Autowired
    ContractService contractService;

    @GetMapping("/new-contract")
    public ModelAndView getContractPage(){
        ModelAndView modelAndView = new ModelAndView("views/createContract","hopDong", new HopDongDTO());
        return  modelAndView;
    }
    @PostMapping("/new-contract")
    public  ModelAndView saveContract(@ModelAttribute("hopDong") HopDongDTO hopDong){
        ModelAndView modelAndView = new ModelAndView("views/createContract");
        contractService.save(hopDong);
        modelAndView.addObject("message", "create contract success");
        return modelAndView;
    }
}
