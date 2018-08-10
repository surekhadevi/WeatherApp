package com.restassured.weatherapp.controller;

import org.junit.Test;
import static com.jayway.restassured.RestAssured.given;

public class WeatherControllerTests {
	@Test
	public void makeSureThatWeatherAppIsUp() {

		given().when().get(
				"https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=ebce57954e64014cbe6f19043f6cc021")
				.then().assertThat().statusCode(200);

		given().when().get(
				"https://samples.openweathermap.org/data/2.5/forecast/daily?lat=35&lon=139&cnt=10&appid=ebce57954e64014cbe6f19043f6cc021")
				.then().assertThat().statusCode(200);

		given().when().get(
				"https://samples.openweathermap.org/data/2.5/uvi/forecast?lat=37.75&lon=-122.37&appid=ebce57954e64014cbe6f19043f6cc021")
				.then().assertThat().statusCode(200);

		given().when()
				.get("https://samples.openweathermap.org/data/3.0/triggers?appid=ebce57954e64014cbe6f19043f6cc021")
				.then().assertThat().statusCode(200);
	}
}
