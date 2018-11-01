package com.Weather.WeatherServer.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class FormController {
    @RequestMapping(value = "sayhello",method = RequestMethod.GET)
    public String sayhello(@RequestParam(value = "usm") String usm){
        return "Hello World!\nWelcome "+usm;
    }
}
