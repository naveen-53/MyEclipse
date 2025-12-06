package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSV_ReaderSimple {
    public static void main(String[] args) {
        String filePath = "example.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {

                // Split by comma
                String[] values = line.split(",");

                // Print each value
                for (String value : values) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
