package com.example.consuming_fipe_api.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dados {
    @JsonAlias("codigo")
    private String code;
    @JsonAlias("nome")
    private String name;

    public Dados(){

    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Código: " + code + ", Descrição: " + name;
    }
}
