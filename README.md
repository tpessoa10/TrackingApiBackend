# 🖥️ Weather Dashboard - Backend API

Esta é a API REST desenvolvida em **Spring Boot** responsável por intermediar a comunicação entre o frontend e a API oficial do OpenWeather. 
Ela recebe as requisições de busca de cidades, consome e centraliza os dados meteorológicos atuais e de previsão, e os entrega formatados de forma segura.

---

## 🛠️ Tecnologias e Recursos

* **Java 17** & **Spring Boot**
* **Spring Web**: Criação dos endpoints REST.
* **Lombok**: Redução de código boilerplate (Getters/Setters).
* **Arquitetura em Memória**: Sem persistência em banco de dados pesado, focando em velocidade de resposta.

---

## 🔑 Configuração Obrigatória (Chave OpenWeather)

O projeto necessita de um token de acesso para consumir os dados do clima.

1. Acesse o site [OpenWeatherMap](https://openweathermap.org/) e crie uma conta gratuita.
2. Vá até a seção **My API Keys** no seu painel.
3. Gere e copie a sua chave de API própria.
4. Abra o arquivo `src/main/resources/application.properties` e insira a chave na seguinte propriedade: openweather.api.key=[SUA_CHAVE_AQUI]
