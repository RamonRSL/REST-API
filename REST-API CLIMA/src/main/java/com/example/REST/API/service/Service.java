
package com.example.REST.API.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
public class Service {
    public String preverTempo(){
        String dadosMeteorologicos = "";
        String apiUrl = "https://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=6a4a58b40182c82547332afb208741e1";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()){

            dadosMeteorologicos = responseEntity.getBody();
        } else {
            dadosMeteorologicos = " Falha ao obter Dados meteorologicos" + responseEntity.getStatusCode();
        }
        return dadosMeteorologicos;
    }

}
