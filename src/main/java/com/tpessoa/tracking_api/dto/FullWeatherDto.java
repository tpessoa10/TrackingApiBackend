package com.tpessoa.tracking_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FullWeatherDto {
    private WeatherDto atual;
    private List<ForecastDto.ForecastItem> previsao;
}