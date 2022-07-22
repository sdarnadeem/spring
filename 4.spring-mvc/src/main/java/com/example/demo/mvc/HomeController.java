package com.example.demo.mvc;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping("/")
    public String showPage() {
        return "main";
    }

    @RequestMapping("/show-form")
    public String showForm() {
        return "main-menu";
    }

    @RequestMapping("/process-form")
    public String processForm() {
        return "main-menu";
    }

}


