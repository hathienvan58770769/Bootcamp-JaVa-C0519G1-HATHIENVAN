package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping("/")
    public String checkbox() {
        return "index";
    }

    @RequestMapping("/save")
    public String save(@RequestParam(name = "condiment", required = false) String[] condiment, Model model) {
        model.addAttribute("condiment", condiment);
        return "index";
    }
}
