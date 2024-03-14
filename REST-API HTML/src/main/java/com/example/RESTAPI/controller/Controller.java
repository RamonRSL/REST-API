package com.example.RESTAPI.controller;

import com.example.RESTAPI.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    Service service = new Service();

    @GetMapping("/example")
    public String exemplo(){
        return service.exampleView();
    }
}
