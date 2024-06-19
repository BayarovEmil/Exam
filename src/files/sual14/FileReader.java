package files.sual14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    public static void main(String[] args) throws IOException {
        final String fileName ="C:\\projects\\finalExam\\src\\files\\data.txt";//your file name
        BufferedReader reader = new BufferedReader(new java.io.FileReader(fileName));
        String line="";
        while ((line = reader.readLine())!=null) {
            System.out.println(line);
        }
        reader.close();
    }
}
