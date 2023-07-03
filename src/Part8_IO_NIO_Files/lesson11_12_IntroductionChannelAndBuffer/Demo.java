package Part8_IO_NIO_Files.lesson11_12_IntroductionChannelAndBuffer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo {

    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile
                ("src/Part8_IO_NIO_Files/lesson11_12_IntroductionChannelAndBuffer/test.txt", "rw");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25);//if added Data more than capacity, throws exception
            StringBuilder builder = new StringBuilder();

            int readBytes = channel.read(buffer);

            while (readBytes > 0) {
                System.out.println("read: " + readBytes);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    builder.append((char) buffer.get());
                }
                buffer.clear();
                readBytes = channel.read(buffer);
            }

            System.out.println(builder);

            String addText = "\n”There are only two ways to live your life.\n" +
                    "One is as though nothing is a miracle.\n" +
                    "The other is as though everything is a miracle.” ― Albert Einstein";
//            ByteBuffer buffer1 = ByteBuffer.allocate(addText.getBytes().length);  |
//            buffer1.put(addText.getBytes());                                      |-> wrap()
//            buffer1.flip();                                                       |
//            channel.write(buffer1);

            ByteBuffer buffer1 = ByteBuffer.wrap(addText.getBytes());
            channel.write(buffer1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
