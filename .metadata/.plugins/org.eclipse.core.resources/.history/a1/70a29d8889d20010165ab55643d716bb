package txt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveinLocal {

	public static void main(String[] args) {
	
		
		String path = "C:/Users/BLUE SCOPE/OneDrive/Desktop/sample.txt";
		
		try {
			
			FileWriter fw = new FileWriter(path);
			fw.write("This file is saved on C drive!");
			fw.close();
			Scanner reader = new Scanner(path);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
