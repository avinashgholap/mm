package com.springfundamentals.mm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;
    private List<String> districts = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void setDistricts(List<String> districts) {
        this.districts = districts;
    }

    public List<String> getDistricts() { return districts; }
}
