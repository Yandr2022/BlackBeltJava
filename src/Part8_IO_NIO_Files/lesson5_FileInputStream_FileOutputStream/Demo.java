package Part8_IO_NIO_Files.lesson5_FileInputStream_FileOutputStream;

import java.io.*;

public class Demo {

    public static void main(String[] args) {
        try (BufferedOutputStream writer = new BufferedOutputStream(
                new FileOutputStream("src/Part8_IO_NIO_Files/lesson5_FileInputStream_FileOutputStream/picture.png"));
             BufferedInputStream reader = new BufferedInputStream(
                     new FileInputStream("C:\\Users\\Юлия\\OneDrive\\Рабочий стол\\picture.png"))){
            int character;
            while ((character = reader.read()) != -1) {
               writer.write((char) character);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
