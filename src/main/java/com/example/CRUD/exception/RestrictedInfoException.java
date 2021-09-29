package com.example.CRUD.exception;

public class RestrictedInfoException extends Exception{

    @Override
    public String getMessage(){
        return "Name cannot be root...";
    }
}
