package com.projects.uber.uberApp.exceptions;

public class ResouceNotFoundException extends RuntimeException{
    public ResouceNotFoundException() {

    }

    public ResouceNotFoundException(String message) {
        super(message);
    }
}
