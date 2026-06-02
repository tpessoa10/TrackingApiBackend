package com.tpessoa.tracking_api.service;


import com.tpessoa.tracking_api.client.OpenWeathetClient;
import com.tpessoa.tracking_api.dto.ForecastDto;
import com.tpessoa.tracking_api.dto.WeatherDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WeatherService {

    @Autowired
    private OpenWeathetClient openWeathetClient;

    @Value("${api.weather.key}")
    private  String apiKey;

    public WeatherDto obterClima(String cidade){
        try{
            return  openWeathetClient.buscarClima(cidade, apiKey, "metric", "pt_br");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar clima: " + e.getMessage());
        }
    }

    public ForecastDto obterPrevisao(String cidade){
        try{
            return openWeathetClient.buscarPrevisao(cidade, apiKey, "metric", "pt_br");
        } catch (Exception e) {
            throw new RuntimeException("Erro buscar previsao: " + e.getMessage());
        }
    }

    public List<ForecastDto.ForecastItem> filtrarPrevisoesDiarias(ForecastDto forecastDto) {
        return forecastDto.getList().stream()
                .filter(item -> item.getDt_txt().contains("12:00:00"))
                .collect(Collectors.toList());
    }
}
