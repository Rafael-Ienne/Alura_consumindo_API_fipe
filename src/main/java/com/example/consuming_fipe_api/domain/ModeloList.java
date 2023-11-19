package com.example.consuming_fipe_api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.Banner;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ModeloList {
    private List<Dados> modelos;

    public ModeloList(){

    }

    public List<Dados> getModelos() {
        return modelos;
    }
}
