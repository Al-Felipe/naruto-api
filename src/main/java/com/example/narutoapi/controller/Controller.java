package com.example.narutoapi.controller;

import com.example.narutoapi.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    ApplicationService applicationService;

    @GetMapping("/characters")
    public String listCharacters(){
        return applicationService.listAllCharacters();
    }

    @GetMapping("/characters/{id}")
    public String listById(@PathVariable int id){
        return applicationService.listCharacterById(id);
    }
}
