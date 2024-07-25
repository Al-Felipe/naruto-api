package com.example.narutoapi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApplicationService {
    public String getApiData(String url){
        String data = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            data = responseEntity.getBody();
        } else {
            data = "Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
        return data;
    }

    public String listAllCharacters(){
        return getApiData("https://dattebayo-api.onrender.com/characters");
    }

    public String listCharacterById(int id){
        return getApiData("https://dattebayo-api.onrender.com/characters/" + id);
    }
}
