package com.company.service.impl;

import com.company.model.People;
import com.company.repository.FileRepository;
import com.company.service.JsonParser;
import com.google.gson.Gson;

public class JsonParserGson implements JsonParser {
    private final Gson gson = new Gson();
    private final FileRepository fileRepository = new FileRepository();

    @Override
    public String parseToJsonAndWriteInFile(People[] peopleList) {
        String parsedData = gson.toJson(peopleList);
        fileRepository.writeInFile(parsedData);
        return parsedData;
    }

    @Override
    public Object parseFromJson(String jsonStr, Class c) {
        return gson.fromJson(jsonStr, c);
    }
}
