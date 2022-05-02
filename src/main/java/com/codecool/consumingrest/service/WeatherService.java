package com.codecool.consumingrest.service;

import com.codecool.consumingrest.restmodel.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${API_KEY}")
    private String apiKey;

    public WeatherData getWeather() {
        WeatherData weatherData = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q=Budapest&appid=" + apiKey + "&lang=hu&units=metric", WeatherData.class);
        return weatherData;
    }
}
