package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CalculatorController {
    @GetMapping("/")
    public String cal() {
        return "index";
    }

    @RequestMapping("/calculator")
    public String calculator(@RequestParam float firstNumber, @RequestParam float secondNumber,
                             @RequestParam(name = "cal", required = false) String cal, Model model) {
        model.addAttribute("firstNumber", firstNumber);
        model.addAttribute("secondNumber", secondNumber);
        model.addAttribute("cal", cal);
        float result = 0;
        switch (cal) {
            case "Addition(+)":
                result = firstNumber + secondNumber;
                break;
            case "Subtraction(-)":
                result = firstNumber - secondNumber;
                break;
            case "Multiplication(*)":
                result = firstNumber * secondNumber;
                break;
            case "Division(/)":
                result = firstNumber / secondNumber;
                break;
            default:

                break;

        }
        model.addAttribute("result", result);

        return "index";
    }

}
