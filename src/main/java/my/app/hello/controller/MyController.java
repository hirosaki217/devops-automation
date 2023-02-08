package my.app.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private String abc = "hihi"
    @GetMapping("/")
    public String index(){
        return "- This is my web application!";
    }
}
