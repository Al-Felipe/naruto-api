package com.example.narutoapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterModel(String id,
                             String name,
                             PersonalModel personal,
                             FamilyModel family,
                             List<String> jutsu
) {
}

