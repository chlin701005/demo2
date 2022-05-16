package com.uuu.demo.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "Mark Ho") String name, Model model) {
        model.addAttribute("name","Mark Ho");
        return "greeting321";
    }
}