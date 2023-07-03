package Part8_IO_NIO_Files.lesson10_File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        File file = new File("BlackBeltJava.iml");
        File folder = new File("C:\\Users\\Юлия\\OneDrive\\Рабочий стол\\test");

        System.out.println("file.getAbsolutePath(): " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath(): " + folder.getAbsolutePath());
        System.out.println("*****************************************");

        System.out.println("file.isAbsolute(): " + file.isAbsolute());
        System.out.println("folder.isAbsolute(): " + folder.isAbsolute());
        System.out.println("*****************************************");

        System.out.println("file.isDirectory(): " + file.isDirectory());
        System.out.println("folder.isDirectory(): " + folder.isDirectory());
        System.out.println("*****************************************");

        File nonExistentFile = new File("src/Part8_IO_NIO_Files/lesson10_File/test/test.txt");
        File nonExistentFolder = new File("src/Part8_IO_NIO_Files/lesson10_File/test");
        System.out.println("file.exists(): " + file.exists());
        System.out.println("nonExistentFile.exists(): " + nonExistentFile.exists());
        System.out.println("folder.exists(): " + folder.exists());
        System.out.println("nonExistentFolder.exists(): " + nonExistentFolder.exists());
        System.out.println("*****************************************");

        try {
            System.out.println("nonExistentFolder.mkdir(): " + nonExistentFolder.mkdir());
            System.out.println("folder.mkdir(): " + folder.mkdir());
            System.out.println("nonExistentFile.createNewFile(): " + nonExistentFile.createNewFile());
            System.out.println("file.createNewFile(): " + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("*****************************************");

        System.out.println("file.length(): " + file.length());
        System.out.println("folder.length(): " + folder.length());
        System.out.println("*****************************************");

        System.out.println("nonExistentFolder.delete(): " + nonExistentFolder.delete());
        System.out.println("nonExistentFile.delete(): " + nonExistentFile.delete());
        System.out.println("nonExistentFolder.delete(): " + nonExistentFolder.delete());
        System.out.println("*****************************************");

        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("*****************************************");

        System.out.println("file.isHidden(): " + file.isHidden());
        System.out.println("file.canRead(): " + file.canRead());
        System.out.println("file.canWrite(): " + file.canWrite());
        System.out.println("file.canRead(): " + file.canRead());


    }
}
