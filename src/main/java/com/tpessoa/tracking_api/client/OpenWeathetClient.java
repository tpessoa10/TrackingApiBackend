package com.tpessoa.tracking_api.client;

import com.tpessoa.tracking_api.dto.ForecastDto;
import com.tpessoa.tracking_api.dto.WeatherDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "openWeatherClient", url = "https://api.openweathermap.org/data/2.5")
public interface OpenWeathetClient {

    @GetMapping("/weather")
    WeatherDto buscarClima(
            @RequestParam("q") String cidade,
            @RequestParam("appid") String apiKey,
            @RequestParam("units") String unidades,
            @RequestParam("lang") String idioma
    );

    @GetMapping("/forecast")
    ForecastDto buscarPrevisao(
            @RequestParam("q") String cidade,
            @RequestParam("appid") String apiKey,
            @RequestParam("units") String unidades,
            @RequestParam("lang") String idioma
    );
}
