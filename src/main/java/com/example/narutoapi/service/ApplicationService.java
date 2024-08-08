package com.example.narutoapi.service;

import com.example.narutoapi.model.CharacterModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApplicationService {
    ObjectMapper mapper = new ObjectMapper();

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

    public CharacterModel listCharacterById(int id){
        String json = getApiData("https://dattebayo-api.onrender.com/characters/" + id);
        return convertJsonToObject(json);
    }

    public CharacterModel convertJsonToObject(String json){
        try {
            return mapper.readValue(json, CharacterModel.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
