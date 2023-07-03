package Part8_IO_NIO_Files.lesson9_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo {

    public static void main(String[] args) {

        try (RandomAccessFile file = new RandomAccessFile
                ("src/Part8_IO_NIO_Files/lesson9_RandomAccessFile/test.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);
            file.seek(101);
            String s = file.readLine();
            System.out.println(s);
            System.out.println(file.getFilePointer());
            file.seek(file.length() - 1);
            file.writeBytes("\n\t\t\t\t\tWilliam Butler Yeats");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
