package org.example.Controllers;

import org.example.Models.Components;
import org.example.Repositories.ComponentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private ComponentsRepository compRepository;

    @GetMapping("/main-page")
    public String MainPage(Model model){
        Iterable<Components> comp = compRepository.findAll();
        return "main-page";
    }

}
