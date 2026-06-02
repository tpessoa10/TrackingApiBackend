package com.tpessoa.tracking_api.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WeatherDto {

    private String name;
    private Number cod;
    private List<Weather> weather;
    private Main main;
    private Wind wind; // Novo campo
    private Sys sys;   // Novo campo

    @Data
    public static class Main{
        private Double temp;
        private Double feels_like;
        private Integer humidity;
        private Double temp_min; // Garanta que esta linha existe
        private Double temp_max;
    }

    @Data
    public static class Weather{
        private String description;
        private String icon;
    }

    @Data
    public static class Wind {
        private Double speed;
    }

    @Data
    public static class Sys {
        private Long sunrise;
        private Long sunset;
        private String country;
    }

}
