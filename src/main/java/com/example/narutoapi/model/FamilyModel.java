package com.example.narutoapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record FamilyModel(String father, String mother, String son, String daughter, String wife) {
}
