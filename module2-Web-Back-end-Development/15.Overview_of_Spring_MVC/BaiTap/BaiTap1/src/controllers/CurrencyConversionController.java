package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConversionController {
    @GetMapping("/home")
    public String currency(){
        return "index";
    }
@GetMapping("/converter")
public String converter(@RequestParam float usd,@RequestParam float rate, Model model){
    float vnd = usd * rate;
    model.addAttribute("vnd", vnd);
    return "converter";
}

}
