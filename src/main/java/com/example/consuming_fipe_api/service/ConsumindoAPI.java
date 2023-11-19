package com.example.consuming_fipe_api.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumindoAPI {

    private static final String ENDERECO_BASE = "https://parallelum.com.br/fipe/api/v1/";
    public String getData(String dado){

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ENDERECO_BASE + dado.toLowerCase()))
                .build();
        HttpResponse<String> response = null;

        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return response.body();

    }
}
