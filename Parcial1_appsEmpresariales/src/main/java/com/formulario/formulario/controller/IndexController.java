package com.formulario.formulario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    
    @GetMapping("/index")
    public String form(Model model){
        model.addAttribute("titulo","Formulario");
        return "index";
    }
}
