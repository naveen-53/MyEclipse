package File_Handling;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_Demo {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("notes.txt");
			System.out.println("Enter value");
			int letters = fr.read();
			while(fr.ready()) {
				System.out.println((char) letters);
				letters= fr.read();
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
