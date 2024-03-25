package com.TemperatureConverter.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grade")
public class DemoController {

    @GetMapping("/celsiusToFahrenheit/{value}")
    public Double celsiusToFahrenheit(@PathVariable("value") Double celsius) {
        Double fahrenheit = Math.round((celsius * 9d / 5d + 32) * 100.0) / 100.0;
        return fahrenheit;
    }

    @GetMapping("/celsiusToKelvin/{value}")
    public Double celsiusToKelvin(@PathVariable("value") Double celsius) {
        Double kelvin = Math.round((celsius + 273.15) * 100.0) / 100.0;
        return kelvin;
    }

    @GetMapping("/fahrenheitToCelcius/{value}")
    public Double fahrenheitToCelcius(@PathVariable("value") Double fahrenheit) {
        Double celsius = Math.round(((fahrenheit - 32) * (5d / 9d)) * 100.0) / 100.0;
        return celsius;
    }

    @GetMapping("/farenheitToKelvin/{value}")
    public Double farenheitToKelvin(@PathVariable("value") Double fahrenheit) {
        Double kelvin = Math.round(((fahrenheit - 32) * 5.0d / 9.0d + 273.15) * 100.0) / 100.0;
        return kelvin;
    }

    @GetMapping("/kelvinToCelsius/{value}")
    public Double kelvinToCelsius(@PathVariable("value") Double kelvin) {
        Double celsius = Math.round((kelvin - 273.15) * 100.0) / 100.0;
        return celsius;
    }

    @GetMapping("/kelvinToFahrenheit/{value}")
    public Double kelvinToFahrenheit(@PathVariable("value") Double kelvin) {
        Double fahrenheit = Math.round((kelvin * 1.8 - 459.67) * 100.0) / 100.0;
        return fahrenheit;
    }
}