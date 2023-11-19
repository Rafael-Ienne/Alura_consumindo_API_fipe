package com.example.consuming_fipe_api.service;

import com.example.consuming_fipe_api.domain.ModeloCompleto;
import com.example.consuming_fipe_api.domain.Dados;
import com.example.consuming_fipe_api.domain.ModeloList;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProcurarVeiculo {

    private Scanner sc = new Scanner(System.in);

    private ConsumindoAPI consumer = new ConsumindoAPI();

    private ConverterDados converter = new ConverterDados();

    public void pesquisar(String tipoVeiculo){

        String marcasEmJson = consumer.getData(tipoVeiculo + "/marcas");

        List<Dados> marcasList = converter.convertDatatoList(marcasEmJson, Dados.class);

        marcasList.stream()
                .sorted(Comparator.comparing(Dados::getCode))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Informe o código da marca da qual se deseja saber os modelos: ");
        String codigoMarca = sc.nextLine();
        String modelosDaMarcaEmJson = consumer.getData(tipoVeiculo + "/marcas/" + codigoMarca + "/modelos");

        var modelosList = converter.convertData(modelosDaMarcaEmJson, ModeloList.class);

        System.out.println();
        modelosList.getModelos().stream()
                        .sorted(Comparator.comparing(Dados::getCode))
                        .forEach(System.out::println);


        System.out.println();
        System.out.println("Informe um trecho do nome do modelo para se informar valores: ");
        String nomeDoModelo = sc.nextLine();
        System.out.println();

        modelosList.getModelos().stream()
                .filter(m -> m.getName().toUpperCase().contains(nomeDoModelo.toUpperCase()))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Informe o código do modelo do veículo para consultar valores:");
        int codigoModelo = sc.nextInt();
        System.out.println();

        String anosEmJson = consumer.getData(tipoVeiculo + "/marcas/" + codigoMarca+ "/modelos/" + codigoModelo + "/anos");

        List<Dados> anosList= converter.convertDatatoList(anosEmJson, Dados.class);

        for(Dados v: anosList){
            String info = consumer.getData(tipoVeiculo + "/marcas/" + codigoMarca+ "/modelos/" + codigoModelo + "/anos/" + v.getCode());
            ModeloCompleto veiculo = converter.convertData(info, ModeloCompleto.class);
            System.out.println(veiculo);
        }

    }
}
