package com.jaydeepdahiya.controller;

import com.jaydeepdahiya.model.City;
import com.jaydeepdahiya.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private ICityService cityService;

    @GetMapping("/cities")
    public List<City> getCities() {

        return cityService.getCities();
    }
}