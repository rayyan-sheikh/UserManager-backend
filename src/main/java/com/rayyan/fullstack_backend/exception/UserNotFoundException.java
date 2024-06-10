package com.rayyan.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id){
        super("No User found with id: " + id);
    }
}
