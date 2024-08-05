# File Manager Application

## Overview

This is a simple File Manager application implemented in Java. The application provides a command-line interface (CLI) to perform various file and directory operations such as listing directory contents, copying, moving, deleting files, creating and deleting directories, and searching for files.

## Features

- Display the contents of a specified directory, including file names, file sizes, and last modified dates
- Copy, move, and delete files within the specified directory
- Create and delete directories within the specified directory
- Search for files within the specified directory based on file name or extension
- Command Line Interface (CLI) for user interaction
- Proper exception handling and logging

## Project Structure

```
src
|-- main
    |-- java
        |-- com
            |-- filemanager
                |-- main
                    |-- Main.java
                |-- operations
                    |-- FileOperations.java
                |-- ui
                    |-- CLI.java
                |-- utils
                    |-- CustomException.java
                    |-- Logger.java
        |-- org
            |-- example
                |-- ExampleClass.java
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor for Java development (e.g., IntelliJ IDEA, Eclipse, VS Code)

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/file-manager.git
   ```

2. Navigate to the project directory:
   ```sh
   cd file-manager
   ```

3. Open the project in your preferred IDE.

### Running the Application

1. Compile the Java files:
   ```sh
   javac src/main/java/com/filemanager/**/*.java
   ```

2. Run the `Main` class:
   ```sh
   java -cp src/main/java com.filemanager.main.Main
   ```

### Usage

Once the application is running, you can use the CLI to perform various file and directory operations. Follow the on-screen prompts to select options and provide the necessary input.

## Code Documentation

### Main Class

- **Main.java**
  - Entry point of the File Manager application.
  - Initializes and starts the CLI interface.

### File Operations

- **FileOperations.java**
  - Provides methods for file and directory operations:
    - `listDirectoryContents(String directoryPath)`
    - `copyFile(String sourcePath, String destinationPath)`
    - `moveFile(String sourcePath, String destinationPath)`
    - `deleteFile(String filePath)`
    - `createDirectory(String directoryPath)`
    - `deleteDirectory(String directoryPath)`
    - `searchFiles(String directoryPath, String searchQuery)`

### Command Line Interface

- **CLI.java**
  - Provides a command-line interface for user interaction.
  - Displays a menu and handles user input to perform file operations.

### Utilities

- **CustomException.java**
  - Custom exception class for the File Manager application.
  
- **Logger.java**
  - Logger class for logging application messages to a file.

### Example Class

- **ExampleClass.java**
  - An example class in the `org.example` package.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure that your code adheres to the project's coding standards and includes appropriate documentation.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Inspired by the need for a simple file manager tool for educational purposes...and also a good grade in CTAC.

```

Feel free to customize the `README.md` file according to your project's specific details and requirements.
