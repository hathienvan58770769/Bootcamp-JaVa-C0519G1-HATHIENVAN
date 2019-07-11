package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.applet.Applet;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LookupDictionaryController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/dictionary")

    public String lookupDictionary(@RequestParam String english, Model model) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "sách");
        dictionary.put("computer", "Máy tính");

        model.addAttribute("english", english);

        String result = dictionary.get(english);

        if (result != null) {
            model.addAttribute("result", result);
        } else {
            model.addAttribute("result", "not found");
        }
        return "dictionary";

    }
}
