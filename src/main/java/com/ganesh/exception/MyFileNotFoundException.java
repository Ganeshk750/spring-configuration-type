package com.ganesh.exception;


/**
 * @created: 27/04/2021 - 1:11 PM
 * @author: Ganesh
 */


public class MyFileNotFoundException extends RuntimeException {

    public MyFileNotFoundException(String message){
        super(message);
    }

    public MyFileNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}
