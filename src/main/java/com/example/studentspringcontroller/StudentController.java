package com.example.studentspringcontroller;

import com.example.model.Student;
import com.example.sevice.StudentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class StudentController {
    @Autowired
    StudentManager studentManager;
    @GetMapping(value = "/home")
    public ModelAndView showAll(){
        List<Student> list=studentManager.findAll();
        ModelAndView modelAndView=new ModelAndView("home");
        modelAndView.addObject("list",list);
        return modelAndView;
    }
    @GetMapping(value = "/create")
    public ModelAndView showFormAdd(Model model){
        Student student= new Student();
        model.addAttribute("student",student);
        ModelAndView modelAndView=new ModelAndView("create");
        return modelAndView;
    }
    @PostMapping(value = "/create")
    public String addStudent(@ModelAttribute("student") Student student){
        studentManager.add(student);
        return "redirect:/home";
    }
    @GetMapping("delete&id={id}")
    public String delete(@PathVariable("id") int id){
        studentManager.delete(id);
        return "redirect:/home";
    }
    @GetMapping(value ="/update&id={id}" )
    public ModelAndView showFormUpdate(@PathVariable int id,Model model){
        Student student =studentManager.StudentFindById(id);
        model.addAttribute("student" ,student);
        ModelAndView modelAndView=new ModelAndView("update");
        return modelAndView;
    }
    @PostMapping("update&id={id}")
    public String update(Student student){
        studentManager.update(student.getId(),student);
        return "redirect:/home";
    }

}
