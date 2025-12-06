package txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) {
		
		try {
            File myFile = new File("example.txt");
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

	}

}
