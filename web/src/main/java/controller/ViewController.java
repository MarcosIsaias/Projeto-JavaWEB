package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/")
    public String cadastro() {
        return "cadastro";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }
}
