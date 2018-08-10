package com.restassured.weatherapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("https://samples.openweathermap.org")
public class WeatherController {

	@GetMapping("/data/2.5/weather?id=2172797&appid=ebce57954e64014cbe6f19043f6cc021")
	public HttpStatus getWeatherstatus() {
		return HttpStatus.OK;
	}

	@GetMapping("/data/2.5/forecast/daily?lat=35&lon=139&cnt=10&appid=ebce57954e64014cbe6f19043f6cc021")
	public HttpStatus getForeCaststatus() {
		return HttpStatus.OK;
	}

	@GetMapping("/data/2.5/uvi/forecast?lat=37.75&lon=-122.37&appid=ebce57954e64014cbe6f19043f6cc021")
	public HttpStatus getUVIstatus() {
		return HttpStatus.OK;
	}

	@GetMapping("/data/3.0/triggers?appid=ebce57954e64014cbe6f19043f6cc021")
	public HttpStatus getDatastatus() {
		return HttpStatus.OK;
	}

}
