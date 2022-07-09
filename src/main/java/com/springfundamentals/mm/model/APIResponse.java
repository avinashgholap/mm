package com.springfundamentals.mm.model;

public class APIResponse<T> {
    T data;
    boolean success;
    String message;

    public APIResponse(T data, boolean success) {
        this.data = data;
        this.success = success;
    }

    public APIResponse(T data, boolean success, String message) {
        this.data = data;
        this.success = success;
        this.message = message;
    }
}
