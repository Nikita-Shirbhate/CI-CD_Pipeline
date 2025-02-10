package com.example.sendevops;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // Serve the index.html page from the static folder
        return "index.html";
    }
}
