package com.ganesh.exception;


/**
 * @created: 27/04/2021 - 1:07 PM
 * @author: Ganesh
 */


public class FileStorageException extends RuntimeException {

    public FileStorageException(String message){
        super(message);
    }

    public FileStorageException(String message, Throwable cause){
        super(message, cause);
    }
}
