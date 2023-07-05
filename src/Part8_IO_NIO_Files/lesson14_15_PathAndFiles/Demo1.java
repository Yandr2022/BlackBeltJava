package Part8_IO_NIO_Files.lesson14_15_PathAndFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/Part8_IO_NIO_Files/lesson14_15_PathAndFiles/test.txt");
        Path dirPath = Paths.get("C:\\Users\\Юлия\\OneDrive\\Рабочий стол\\test1");
        Path dirPath1 = Paths.get("C:\\Users\\Юлия\\OneDrive\\Рабочий стол\\test2");

//        Files.copy(filePath, dirPath.resolve(filePath.getFileName()), StandardCopyOption.REPLACE_EXISTING);//or copy with new name
//        Files.copy(dirPath1, dirPath.resolve(dirPath1.getFileName()));//files from the copied folder are not copied
//        Files.move(dirPath1.resolve("test.txt"),dirPath.resolve("moved file.txt"));
//        Files.move(filePath, filePath.getParent().resolve("renamed file.txt"));
//        Files.copy(filePath.getParent().resolve("renamed file.txt"),filePath);
//        Files.delete(filePath.getParent().resolve("renamed file.txt"));
//        Files.delete(dirPath1);//if contains files - throws .DirectoryNotEmptyException

        Path path = Paths.get("src/Part8_IO_NIO_Files/lesson14_15_PathAndFiles/test1.txt");
//        Files.createFile(path);
//        String dialog = "-Hello\n-Good Morning!\n-How are you?\n-Thanks, i'm fine, and you?";
//        Files.write(path, dialog.getBytes());
        System.out.println(Files.readAllLines(path));

    }
}
