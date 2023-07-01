package Part8_IO_NIO_Files.lesson4_BufferReader_BufferWriter;

import java.io.*;

public class Demo {

    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("src/Part8_IO_NIO_Files/lesson4_BufferReader_BufferWriter/test.txt"));
             BufferedReader reader = new BufferedReader(
                     new FileReader("src/Part8_IO_NIO_Files/lesson1_StreamsIntroduction_FileWriter/test2.txt"))) {

//            int character;
//            while ((character = reader.read()) != -1) {
//               writer.write((char) character);
//            }

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
