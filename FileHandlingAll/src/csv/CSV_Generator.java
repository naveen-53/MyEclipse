package csv;

import java.io.FileWriter;
import java.io.IOException;

public class CSV_Generator {
    public static void main(String[] args) {
        String fileName = "example.csv";

        try{
        	FileWriter writer = new FileWriter(fileName);
            writer.append("ID,Name,Department\n");
            writer.append("1,Alice,IT\n");
            writer.append("2,Bob,HR\n");
            writer.append("3,Charlie,Finance\n");

            System.out.println("CSV file created: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
          }
}
