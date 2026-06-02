package com.tpessoa.tracking_api.controller;

import com.tpessoa.tracking_api.dto.ForecastDto;
import com.tpessoa.tracking_api.dto.FullWeatherDto;
import com.tpessoa.tracking_api.dto.WeatherDto;
import com.tpessoa.tracking_api.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/clima")
@CrossOrigin(origins = "*")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{cidade}")
    public ResponseEntity<FullWeatherDto> getClima(@PathVariable String cidade) {
        WeatherDto atual = weatherService.obterClima(cidade);
        ForecastDto previsao = weatherService.obterPrevisao(cidade);
        List<ForecastDto.ForecastItem> previsaoFiltrada = weatherService.filtrarPrevisoesDiarias(previsao);

        FullWeatherDto resposta = new FullWeatherDto(atual,previsaoFiltrada);

        return ResponseEntity.ok(resposta);
    }
}
