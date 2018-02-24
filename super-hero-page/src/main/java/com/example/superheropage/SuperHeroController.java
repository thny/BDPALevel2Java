package com.example.superheropage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuperHeroController {
    @RequestMapping("/superhero")
    public String greeting(Model model) {
        model.addAttribute("name", "narwhal boy");
        model.addAttribute("power1", "has a tusk");
        model.addAttribute("power2", "breath in ocean");
        model.addAttribute("power3", "scary noises");
        model.addAttribute("fact1", "can stab with his tusk");
        model.addAttribute("fact2", "he can swim about the same as a person");
        model.addAttribute("fact3", "kind of a creep");

        return "hero"; //Return "hero" to tell spring to use the hero.html template
    }
}
