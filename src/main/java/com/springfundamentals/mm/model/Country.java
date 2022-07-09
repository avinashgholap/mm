package com.springfundamentals.mm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Document()
public class Country {
    @Id
    private String id;

    @NotNull(message = "Country name can not be null")
    private String name;

    private List<State> states = new ArrayList<State>();

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<State> getStates() {
        return states;
    }

    public void setState(List<State> states) {
        this.states = states;
    }
}
