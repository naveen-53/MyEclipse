package txt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	
	public static void main(String[] args) {
		
		try {
			
			File myFile = new File("example.txt");
			if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

			
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, Java File Handling!");
            writer.write("Hello, I'm Naveen!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
	}

}
