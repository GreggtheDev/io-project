
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

    /**
     * Displays the main menu of the CLI.
     */
    private void displayMenu() {
        System.out.println("\nFile Manager");
        System.out.println("1. Display contents of a directory");
        System.out.println("2. Copy a file");
        System.out.println("3. Move a file");
        System.out.println("4. Delete a file");
        System.out.println("5. Create a directory");
        System.out.println("6. Delete a directory");
        System.out.println("7. Search for files");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    private void listContents() throws IOException {
        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();
        List<String> contents = FileOperations.listDirectoryContents(directoryPath);
        contents.forEach(System.out::println);
    }

    private void copyFile() throws IOException {
        System.out.print("Enter source file path: ");
        String sourcePath = scanner.nextLine();
        System.out.print("Enter destination file path: ");
        String destinationPath = scanner.nextLine();
        FileOperations.copyFile(sourcePath, destinationPath);
        System.out.println("File copied successfully.");
    }

    private void moveFile() throws IOException {
        System.out.print("Enter source file path: ");
        String sourcePath = scanner.nextLine();
        System.out.print("Enter destination file path: ");
        String destinationPath = scanner.nextLine();
        FileOperations.moveFile(sourcePath, destinationPath);
        System.out.println("File moved successfully.");
    }

    private void deleteFile() throws IOException {
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();
        FileOperations.deleteFile(filePath);
        System.out.println("File deleted successfully.");
    }

    private void createDirectory() throws IOException {
        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();
        FileOperations.createDirectory(directoryPath);
        System.out.println("Directory created successfully.");
    }

    private void deleteDirectory() throws IOException {
        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();
        FileOperations.deleteDirectory(directoryPath);
        System.out.println("Directory deleted successfully.");
    }

    private void searchFiles() throws IOException {
        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();
        System.out.print("Enter search query (file name or extension): ");
        String searchQuery = scanner.nextLine();
        List<String> results = FileOperations.searchFiles(directoryPath, searchQuery);
        results.forEach(System.out::println);
    }
}
