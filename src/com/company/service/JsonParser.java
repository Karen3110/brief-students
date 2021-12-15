package com.company.service;

import com.company.model.People;

import java.util.LinkedList;

public interface JsonParser {

    String parseToJsonAndWriteInFile(People... o);


    Object parseFromJson(String jsonStr, Class c);

}
