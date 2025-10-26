package droverota.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrivacidadeController {

    @GetMapping("/privacidade")
    public String home(Model model) {
        return "privacidade";
    }
}