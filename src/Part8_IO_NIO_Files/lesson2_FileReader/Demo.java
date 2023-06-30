package Part8_IO_NIO_Files.lesson2_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("src/Part8_IO_NIO_Files/lesson1_StreamsIntroduction_FileWriter/test2.txt");
            int character;
            while ((character = reader.read()) != -1) {
                    System.out.print((char) character);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
