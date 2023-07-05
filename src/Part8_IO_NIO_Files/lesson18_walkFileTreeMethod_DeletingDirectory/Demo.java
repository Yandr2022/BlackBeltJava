package Part8_IO_NIO_Files.lesson18_walkFileTreeMethod_DeletingDirectory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Demo {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Юлия\\OneDrive\\Рабочий стол\\CopyHere");
        try {
            Files.walkFileTree(path, new MyFileVisitor());
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

class MyFileVisitor extends SimpleFileVisitor<Path> {


    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Delete Directory: " + dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;

    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Delete File: " + file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }


}

