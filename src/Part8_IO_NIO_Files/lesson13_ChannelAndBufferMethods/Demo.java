package Part8_IO_NIO_Files.lesson13_ChannelAndBufferMethods;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo {

    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile(
                "src/Part8_IO_NIO_Files/lesson13_ChannelAndBufferMethods/test.txt", "r");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.print((char) buffer.get());
            System.out.print((char) buffer.get());
            System.out.print((char) buffer.get());
            System.out.println("\n**********************");
            buffer.rewind();
            System.out.println((char) buffer.get());
            System.out.println("**********************");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            System.out.println("\n**********************");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            System.out.println(buffer.mark() + ", marks: " + (char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.reset();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
