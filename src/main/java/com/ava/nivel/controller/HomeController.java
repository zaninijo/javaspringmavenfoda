package com.ava.nivel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Bem-vindo ao Spring Boot com Thymeleaf!");
        model.addAttribute("title", "Página Inicial");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Sobre");
        model.addAttribute("description", "Este é um projeto Spring Boot com Maven, SQLite e Thymeleaf");
        return "about";
    }
}
