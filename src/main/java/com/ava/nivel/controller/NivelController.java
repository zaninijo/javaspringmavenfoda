package com.ava.nivel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ava.nivel.model.NivelModel;
import com.ava.nivel.repository.NivelRepository;

@Controller
@RequestMapping("/nivel")
public class NivelController {

    @Autowired
    private NivelRepository repo;

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "nivel_forms";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute NivelModel nivel) {
        repo.save(nivel);
        return "redirect:/nivel/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("niveis", repo.findAll());
        return "nivel_listar";
    }

    @GetMapping("/lista/{id}")
    public String buscar(@PathVariable Integer id, Model model) {
        model.addAttribute("niveis", repo.findById(id).orElse(null));
        return "nivel_listar";
    }
}
