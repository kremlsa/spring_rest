package org.example.spring.mvc.rest.exception_handling;

public class NoSuchEmployee extends RuntimeException{
    public NoSuchEmployee(String message) {
        super(message);
    }
}
