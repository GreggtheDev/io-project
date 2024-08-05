
Copy code
        package com.filemanager.ui;

import com.filemanager.operations.FileOperations;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Command Line Interface for the File Manager application.
 */
public class CLI {

    private final Scanner scanner = new Scanner(System.in);

    /**
     * Starts the CLI to interact with the user.
     */
    public void start() {
        while (true) {
            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            try {
                switch (choice) {
                    case 1:
                        listContents();
                        break;
                    case 2:
                        copyFile();
                        break;
                    case 3:
                        moveFile();
                        break;
                    case 4:
                        deleteFile();
                        break;
                    case 5:
                        createDirectory();
                        break;
                    case 6:
                        deleteDirectory();
                        break;
                    case 7:
                        searchFiles();
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
