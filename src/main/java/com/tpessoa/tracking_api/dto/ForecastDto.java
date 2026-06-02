package com.tpessoa.tracking_api.dto;

import lombok.Data;

import java.util.List;

@Data
public class ForecastDto {
    private String cod;
    private Integer message;
    private Integer cnt; // Quantidade de registros retornados (geralmente 40)
    private List<ForecastItem> list; // A lista com as previsões de 3 em 3 horas
    private City city;

    @Data
    public static class ForecastItem {
        private Long dt; // Timestamp da previsão
        private Main main;
        private List<Weather> weather;
        private String dt_txt; // Data e hora em formato texto (ex: "2026-05-16 12:00:00")
    }

    @Data
    public static class Main {
        private Double temp;
        private Double temp_min;
        private Double temp_max;
        private Integer humidity;
    }

    @Data
    public static class Weather {
        private String description;
        private String icon;
    }

    @Data
    public static class City {
        private String name;
        private String country;
    }

    @Data
    public static class Wind {
        private Double speed;
    }
}