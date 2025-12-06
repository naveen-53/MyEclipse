package txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

/**
 * FileHandlingAllInOne.java
 *
 * Demonstrates multiple file operations in separate methods:
 * - createFile
 * - writeToFile (overwrite)
 * - appendToFile
 * - readFile (BufferedReader)
 * - deleteFile
 * - writeUsingNIO
 * - readUsingNIO
 *
 * Simple console menu for testing.
 */
public class FileHandlingAllInOne {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== File Handling All-in-One ===");

        boolean running = true;
        while (running) {
            printMenu();
            String choice = sc.nextLine().trim();
            try {
                switch (choice) {
                    case "1":
                        System.out.print("Enter filename to create: ");
                        createFile(sc.nextLine().trim());
                        break;
                    case "2":
                        System.out.print("Enter filename to write (overwrite): ");
                        String f1 = sc.nextLine().trim();
                        System.out.println("Enter text to write (single line).");
                        System.out.print("> ");
                        writeToFile(f1, sc.nextLine());
                        break;
                    case "3":
                        System.out.print("Enter filename to append to: ");
                        String f2 = sc.nextLine().trim();
                        System.out.println("Enter text to append (single line).");
                        System.out.print("> ");
                        appendToFile(f2, sc.nextLine());
                        break;
                    case "4":
                        System.out.print("Enter filename to read: ");
                        readFile(sc.nextLine().trim());
                        break;
                    case "5":
                        System.out.print("Enter filename to delete: ");
                        deleteFile(sc.nextLine().trim());
                        break;
                    case "6":
                        System.out.print("Enter filename to write using NIO: ");
                        String fnioW = sc.nextLine().trim();
                        System.out.println("Enter text to write using NIO (single line).");
                        System.out.print("> ");
                        writeUsingNIO(fnioW, sc.nextLine());
                        break;
                    case "7":
                        System.out.print("Enter filename to read using NIO: ");
                        readUsingNIO(sc.nextLine().trim());
                        break;
                    case "0":
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Operation failed: " + e.getMessage());
            }
            System.out.println();
        }

        System.out.println("Goodbye!");
        sc.close();
    }

    private static void printMenu() {
        System.out.println("Choose an option:");
        System.out.println(" 1 - Create file");
        System.out.println(" 2 - Write to file (overwrite)");
        System.out.println(" 3 - Append to file");
        System.out.println(" 4 - Read file (BufferedReader)");
        System.out.println(" 5 - Delete file");
        System.out.println(" 6 - Write using NIO (Files.write)");
        System.out.println(" 7 - Read using NIO (Files.readAllLines)");
        System.out.println(" 0 - Exit");
        System.out.print("Choice: ");
    }

    /**
     * Create a file if it doesn't exist.
     *
     * @param filename name of the file to create
     */
    public static void createFile(String filename) {
        File file = new File(filename);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    /**
     * Overwrite file contents (or create and write if missing).
     *
     * @param filename name of the file
     * @param content  content to write (single string; can include '\n' if you want)
     */
    public static void writeToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, false))) {
            writer.write(content);
            writer.newLine();
            System.out.println("Successfully wrote to the file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    /**
     * Append a line to the file (creates the file if it doesn't exist).
     *
     * @param filename name of the file
     * @param content  content to append
     */
    public static void appendToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(content);
            writer.newLine();
            System.out.println("Successfully appended to the file: " + filename);
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }

    /**
     * Read a file line by line using BufferedReader.
     *
     * @param filename name of the file to read
     */
    public static void readFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File does not exist: " + filename);
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("---- Start of file: " + filename + " ----");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("---- End of file ----");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    /**
     * Delete a file.
     *
     * @param filename name of the file to delete
     */
    public static void deleteFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found: " + filename);
            return;
        }
        if (file.delete()) {
            System.out.println("Deleted file: " + filename);
        } else {
            System.out.println("Failed to delete file: " + filename);
        }
    }

    /**
     * Write to file using java.nio.file.Files (overwrites by default).
     *
     * @param filename name of the file
     * @param content  content to write
     */
    public static void writeUsingNIO(String filename, String content) {
        try {
            Files.write(Paths.get(filename), (content + System.lineSeparator()).getBytes());
            System.out.println("Wrote using NIO to: " + filename);
        } catch (IOException e) {
            System.out.println("NIO write failed: " + e.getMessage());
        }
    }

    /**
     * Read all lines using java.nio.file.Files.readAllLines
     *
     * @param filename name of the file
     */
    public static void readUsingNIO(String filename) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            System.out.println("---- Start of file (NIO): " + filename + " ----");
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println("---- End of file ----");
        } catch (IOException e) {
            System.out.println("NIO read failed: " + e.getMessage());
        }
    }

    // Extra helper (example): append using NIO (not in menu, but useful)
    public static void appendUsingNIO(String filename, String content) {
        try {
            Files.write(Paths.get(filename),
                        (content + System.lineSeparator()).getBytes(),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Appended using NIO to: " + filename);
        } catch (IOException e) {
            System.out.println("NIO append failed: " + e.getMessage());
        }
    }
}
