package com.codecool.consumingrest.restmodel;

import java.util.List;

public class WeatherData {

    public List<Weather> weather;
    public Main main;

    public static class Weather {
        public String description;
    }

    public static class Main {
        public double temp;
        public double feels_like;
    }
}
