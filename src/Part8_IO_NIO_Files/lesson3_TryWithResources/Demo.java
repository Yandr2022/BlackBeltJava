package Part8_IO_NIO_Files.lesson3_TryWithResources;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) {
        String s = "Hello";
        try (FileWriter writer = new FileWriter("src/Part8_IO_NIO_Files/lesson3_TryWithResources/test.txt", true)
             ; FileReader reader = new FileReader("src/Part8_IO_NIO_Files/lesson3_TryWithResources/test.txt")) {
            writer.write(s);
            System.out.println("Done!");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



