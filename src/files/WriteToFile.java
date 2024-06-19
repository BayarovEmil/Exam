package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        final String fileName = "C:\\projects\\finalExam\\src\\files\\data.txt";//your file name
        String username = "Lazarus";
        int age =18;
        String university ="BEU";
        String data =username+","+age+","+university;
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
        writer.write(data);
        writer.close();
    }
}
