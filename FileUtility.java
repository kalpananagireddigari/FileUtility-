/*
 * FILE HANDLING UTILITY
 * Author: Student
 * Description:
 * This program demonstrates basic file operations in Java:
 * 1. Create a file
 * 2. Write data to a file
 * 3. Read data from a file
 * 4. Append data to a file
 * 5. Delete a file
 */

import java.io.*;

public class FileUtility {

    static String fileName = "sample.txt";

    // Create a file
    public static void createFile() {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file.");
        }
    }

    // Write data to file
    public static void writeFile() {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this data is written to the file.\n");
            writer.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    // Append data to file
    public static void appendFile() {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("This line is appended to the file.\n");
            writer.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file.");
        }
    }

    // Read data from file
    public static void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nFile Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    // Delete file
    public static void deleteFile() {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("\nFile deleted successfully.");
        } else {
            System.out.println("\nFailed to delete file.");
        }
    }

    public static void main(String[] args) {
        System.out.println("FILE HANDLING UTILITY\n");

        createFile();
        writeFile();
        appendFile();
        readFile();
        deleteFile();
    }
}
