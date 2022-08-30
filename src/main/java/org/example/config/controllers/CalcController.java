package org.example.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/third")
public class CalcController {
    @GetMapping("/multi")
    public String multiplication(@RequestParam("a") int a, @RequestParam("b") int b, Model model){
        model.addAttribute("multi", a*b);

        return "/third/multi";
    }
    @GetMapping("/add")
    public String addition(@RequestParam("a") int a, @RequestParam("b") int b, Model model){
        model.addAttribute("add", a+b);
        return "third/add";
    }
    @GetMapping("/sub")
    public String subtraction(@RequestParam("a") int a, @RequestParam("b") int b, Model model){
        model.addAttribute("sub", a-b);
        return "/third/sub";
    }
    @GetMapping("/div")
    public String division(@RequestParam("a") int a, @RequestParam("b") int b, Model model){
        model.addAttribute("div", a/b);
        return "/third/div";
    }
}
