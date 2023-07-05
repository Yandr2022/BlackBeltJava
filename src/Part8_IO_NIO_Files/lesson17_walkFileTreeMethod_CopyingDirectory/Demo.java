package Part8_IO_NIO_Files.lesson17_walkFileTreeMethod_CopyingDirectory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Demo {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Юлия\\OneDrive\\Рабочий стол\\X");
        Path path1 = Paths.get("C:\\Users\\Юлия\\OneDrive\\Рабочий стол\\CopyHere");
        try {
            Files.walkFileTree(path, new MyFileVisitor(path, path1));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

class MyFileVisitor extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyFileVisitor(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination);
        return FileVisitResult.CONTINUE;
    }


}

