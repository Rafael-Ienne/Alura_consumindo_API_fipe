package com.example.consuming_fipe_api.principal;

import com.example.consuming_fipe_api.service.ProcurarVeiculo;

import java.util.*;

public class Principal {

    private Scanner sc = new Scanner(System.in);

    private ProcurarVeiculo search = new ProcurarVeiculo();

    public void showMenu(){
        System.out.println();
        System.out.println("***OPÇÕES***");
        System.out.println("Carro");
        System.out.println("Moto");
        System.out.println("Caminhão");

        System.out.println();

        System.out.println("Informe uma das opções para consultar valores: ");
        String tipoVeiculo = sc.nextLine();

        if(tipoVeiculo.toUpperCase().contains("CARR")){
            search.pesquisar("carros");
        } else if(tipoVeiculo.toUpperCase().contains("MOT")){
            search.pesquisar("motos");
        } else if(tipoVeiculo.toUpperCase().contains("CAMINH")){
            search.pesquisar("caminhoes");
        } else {
            System.out.println("Tipo de veículo inválido. Tente novamente");
        }
    }

}
