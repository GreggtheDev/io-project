package com.filemanager.utils;

/**
 * Custom exception class for the File Manager application.
 */
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

