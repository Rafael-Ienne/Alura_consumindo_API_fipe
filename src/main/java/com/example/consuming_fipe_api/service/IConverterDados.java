package com.example.consuming_fipe_api.service;

import java.util.List;

public interface IConverterDados {
    <T> List<T> convertDatatoList(String json, Class<T> classe);

    <T> T convertData(String json, Class<T> classe);
}
