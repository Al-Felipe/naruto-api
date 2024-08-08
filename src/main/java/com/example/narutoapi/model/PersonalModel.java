package com.example.narutoapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PersonalModel(String birthdate, String sex) {
}
