package controllers;

import model.Dependency.DungSiThongThai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DungSiNaoToController {
    @Autowired
    public DungSiThongThai dungSiThongThai;
    @GetMapping("/dungsinaoto")

    public String dungsinaoto(Model model) {
        String ketqua = dungSiThongThai.thucHienNhiemVu();

        model.addAttribute("ketqua", ketqua);
        return "DungSiDepTrai";
    }
}

