package com.springfundamentals.mm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Religion {

    @Id
    private String id;

    private String name;

    private List<String> castes = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCastes() {
        return castes;
    }

    public void setCastes(List<String> castes) {
        this.castes = castes;
    }
}
