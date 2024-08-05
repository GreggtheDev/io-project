package com.filemanager.operations;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides file operations such as list, copy, move, delete, create directory, delete directory, and search.
 */
public class FileOperations {

    /**
     * Lists the contents of the specified directory.
     *
     * @param directoryPath Path of the directory to list contents.
     * @return List of directory contents with details.
     * @throws IOException if an I/O error occurs.
     */
    public static List<String> listDirectoryContents(String directoryPath) throws IOException {
        List<String> contents = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(directoryPath))) {
            for (Path entry : stream) {
                File file = entry.toFile();
                contents.add(String.format("%s - %d bytes - Last Modified: %s",
                        file.getName(), file.length(), Files.getLastModifiedTime(entry)));
            }
        }
        return contents;
    }

    /**
     * Copies a file from source to destination.
     *
     * @param sourcePath      Path of the source file.
     * @param destinationPath Path of the destination file.
     * @throws IOException if an I/O error occurs.
     */
    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
        Files.copy(Paths.get(sourcePath), Paths.get(destinationPath), StandardCopyOption.REPLACE_EXISTING);
    }

    /**
     * Moves a file from source to destination.
     *
     * @param sourcePath      Path of the source file.
     * @param destinationPath Path of the destination file.
     * @throws IOException if an I/O error occurs.
     */
    public static void moveFile(String sourcePath, String destinationPath) throws IOException {
        Files.move(Paths.get(sourcePath), Paths.get(destinationPath), StandardCopyOption.REPLACE_EXISTING);
    }