package com.filemanager.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Logger class for logging application messages to a file.
 */
public class Logger {

    private static final String LOG_FILE = "application.log";

    /**
     * Logs a message to the log file.
     *
     * @param message Message to log.
     */
    public static void log(String message) {
        try {
            Files.write(Paths.get(LOG_FILE), (message + System.lineSeparator()).getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Failed to write to log file: " + e.getMessage());
        }
    }
}

