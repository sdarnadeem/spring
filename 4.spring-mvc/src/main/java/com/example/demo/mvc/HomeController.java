package com.example.demo.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String showPage() {
        return "main-menu";
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
