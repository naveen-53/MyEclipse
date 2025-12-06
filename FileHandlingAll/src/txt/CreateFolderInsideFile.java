package txt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFolderInsideFile {

	public static void main(String[] args) {

        try {
            // Step 1: Create folder inside project
            File folder = new File("files"); // folder name
            if (!folder.exists()) {
                folder.mkdir();
                System.out.println("Folder created: " + folder.getAbsolutePath());
            } else {
                System.out.println("Folder already exists.");
            }

            // Step 2: File path inside the new folder
            String filePath = "files/example.txt";

            // Step 3: Create and write to file
            FileWriter writer = new FileWriter(filePath);
            writer.write("Hello Chief!\nThis file is stored inside the 'files' folder.");
            writer.close();

            System.out.println("File stored at: " + filePath);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
