package com.avognon.practice.controllers;

import com.avognon.practice.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("school")
public class StudentController {

    private static List<String> studentList = new ArrayList<>();



    @GetMapping()
    public String myList(Model model){
        model.addAttribute("stdList", studentList);
        return "school/index";
    }


    @GetMapping("create")
    public String creatStudent(){
        return "school/studentform";
    }

    @PostMapping("create")
    public String addStudent ( @RequestParam String fName){
        studentList.add(fName);
        return "redirect:";
    }


}
