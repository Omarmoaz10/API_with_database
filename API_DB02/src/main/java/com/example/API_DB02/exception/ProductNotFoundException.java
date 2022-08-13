package com.example.API_DB02.exception;

public class ProductNotFoundException extends RuntimeException{
    private static final long serialversionUID=1l;

    public ProductNotFoundException(Long id) {
        super("The product with "+id + "cannot be found!");
    }
}
