package org.example.exception;


public class TestEntityNotFoundException extends RuntimeException{
    TestEntityNotFoundException(String exceptionMessage){
        super(exceptionMessage);
    }
}
