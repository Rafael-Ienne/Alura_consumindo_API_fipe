package com.example.consuming_fipe_api.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ModeloCompleto {

    @JsonAlias("Valor")
    private String value;
    @JsonAlias("Marca")
    private String brand;
    @JsonAlias("AnoModelo")
    private String year;
    @JsonAlias("Combustivel")
    private String fuel;
    @JsonAlias("Modelo")
    private String name;

    public ModeloCompleto(){

    }

    public String getValue() {
        return value;
    }

    public String getBrand() {
        return brand;
    }

    public String getYear() {
        return year;
    }

    public String getFuel() {
        return fuel;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Veículo: [valor: R$" + value
                + ", marca= " + brand
                + ", modelo= " + name
                + ", ano= " + year
                + ", combustível= " + fuel + ']';
    }
}
