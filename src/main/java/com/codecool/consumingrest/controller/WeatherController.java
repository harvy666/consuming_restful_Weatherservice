package com.codecool.consumingrest.controller;

import com.codecool.consumingrest.restmodel.WeatherData;
import com.codecool.consumingrest.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherData getWeather() {
        return weatherService.getWeather();
    }
}
