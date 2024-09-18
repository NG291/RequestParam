package com.module4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping("/sandwich")
    public String showCondiments() {
        return "sandwich";
    }

    @PostMapping("/save")
    public String saveCondiments(@RequestParam("condiment") String[] condiments, Model model) {
        model.addAttribute("selectedCondiments", condiments);
        return "result";
    }
}
