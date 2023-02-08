package co.develhope.swagger2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {
    @GetMapping
    public String welcome (){
        return " welcome in localhost:5050";
    }

}
