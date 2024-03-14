package com.example.RESTAPI.service;

import org.springframework.core.codec.StringDecoder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
public class Service {

    private String consultarURL(String apiURL){
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()){
            dados = responseEntity.getBody();
        } else {
            dados = "Falha ao obter dados. Codigo de status: " + responseEntity.getStatusCode();
        }
        return dados;
    }
    public String consultarMarcas(){
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas");
    }
    public String consultarModelos(int id){
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/" +id+"/modelos");
    }
    public String consultarAnos(int marca, int modelo){
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/" +marca+"/modelos");
    }
    public String consultarValor(int marca, int modelo, int ano){
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/" +marca+"/modelos"+modelo+"/anos"+ano);
    }

}