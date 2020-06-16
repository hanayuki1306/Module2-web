package student.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import student.springboot.models.Student;
import student.springboot.services.StudentService;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public ModelAndView getHomeStudent(){
        List<Student> list = studentService.getAllStudent();
        return new ModelAndView("index","students",studentService.getAllStudent());
    }
    @GetMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable int id, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","delete success");
        studentService.deleteStudentById(id) ;
        return "redirect:/";
    }
    @GetMapping("/student/edit/{id}")
    public ModelAndView editPage(@PathVariable int id){
        return new ModelAndView("edit","student",studentService.getStudentById(id));
    }
    @PostMapping("/student/edit")
    public String editStudent(){
        return "edit";
    }

}
