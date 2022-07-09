package com.springfundamentals.mm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class GenderWithMaritalStatus {
    @Id
    private String id;

    private String gender;

    private List<String> maritalStatus = new ArrayList<String>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(List<String> maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
