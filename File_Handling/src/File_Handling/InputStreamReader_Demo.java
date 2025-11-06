package File_Handling;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_Demo {

	public static void main(String[] args) {
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			System.out.println("Enter value");
			int letters = isr.read();
			while(isr.ready()) {
				System.out.println((char) letters);
				letters= isr.read();
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
