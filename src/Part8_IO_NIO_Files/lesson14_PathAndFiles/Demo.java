package Part8_IO_NIO_Files.lesson14_PathAndFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/Part8_IO_NIO_Files/lesson14_PathAndFiles/test.txt");
        Path dirPath = Paths.get("C:\\Users\\Юлия\\OneDrive\\Рабочий стол\\test1");

        System.out.println("filePath.getFileName(): " + filePath.getFileName());
        System.out.println("dirPath.getFileName(): " + dirPath.getFileName());
        System.out.println("*******************************************");

        System.out.println("filePath.getParent(): " + filePath.getParent());
        System.out.println("dirPath.getParent(): " + dirPath.getParent());
        System.out.println("*******************************************");

        System.out.println("filePath.getRoot(): " + filePath.getRoot());
        System.out.println("dirPath.getRoot(): " + dirPath.getRoot());
        System.out.println("*******************************************");

        System.out.println("filePath.isAbsolute(): " + filePath.isAbsolute());
        System.out.println("dirPath.isAbsolute(): " + dirPath.isAbsolute());
        System.out.println("*******************************************");

        System.out.println("filePath.toAbsolutePath(): " + filePath.toAbsolutePath());
        System.out.println("dirPath.toAbsolutePath(): " + dirPath.toAbsolutePath());
        System.out.println("*******************************************");

        System.out.println("filePath.toAbsolutePath().getParent(): " + filePath.toAbsolutePath().getParent());
        System.out.println("dirPath.toAbsolutePath().getParent(): " + dirPath.toAbsolutePath().getParent());
        System.out.println("*******************************************");

        System.out.println("filePath.toAbsolutePath().getRoot(): " + filePath.toAbsolutePath().getRoot());
        System.out.println("dirPath.toAbsolutePath().getRoot(): " + dirPath.toAbsolutePath().getRoot());
        System.out.println("*******************************************");

        System.out.println("dirPath.resolve(filePath.getFileName()): " + dirPath.resolve(filePath.getFileName()));
        System.out.println("*******************************************");

        Path anotherPath = Paths.get("C:\\Users\\Юлия\\OneDrive\\Рабочий стол\\test1\\test2\\test3");
        System.out.println("dirPath.relativize(anotherPath): " + dirPath.relativize(anotherPath));
        System.out.println("*******************************************");

        if(!Files.exists(filePath)){
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(!Files.exists(dirPath)){
            try {
                Files.createDirectory(dirPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Files.isReadable(filePath): " + Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath): " + Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath): " + Files.isExecutable(filePath));
        System.out.println("*******************************************");

        Path samePath = Paths.get("C:\\Users\\Юлия\\BlackBeltJava\\src\\Part8_IO_NIO_Files\\lesson14_PathAndFiles\\test.txt");
            System.out.println("Files.isSameFile(filePath,samePath): " + Files.isSameFile(filePath,samePath));
        System.out.println("*******************************************");

            System.out.println("Files.size(filePath): " + Files.size(filePath));
        System.out.println("*******************************************");

        System.out.println("Files.getAttribute(filePath, 'creationTime'):"
                + Files.getAttribute(filePath, "creationTime"));
        System.out.println("Files.getAttribute(filePath, 'size'): "
                + Files.getAttribute(filePath, "size"));
        System.out.println("Files.readAttributes(filePath, \"*\"): ");
        Map<String, Object> map = Files.readAttributes(filePath, "*");
      for (Map.Entry<String, Object> entry: map.entrySet()){
          System.out.println(entry.getKey() + ": " + entry.getValue());
      }

    }

}
