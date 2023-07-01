package Part8_IO_NIO_Files.lesson6_DataInputStream_DataOutputStream;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        try (DataOutputStream writer = new DataOutputStream(
                new FileOutputStream("src/Part8_IO_NIO_Files/lesson6_DataInputStream_DataOutputStream/test.bin"));
             DataInputStream reader = new DataInputStream(
                     new FileInputStream("src/Part8_IO_NIO_Files/lesson6_DataInputStream_DataOutputStream/test.bin"))){
       writer.writeBoolean(true);
       writer.writeByte(5);
       writer.writeShort(120);
       writer.writeInt(500);
       writer.writeLong(120_000_000);
       writer.writeDouble(1.2);
            System.out.println(reader.readBoolean());
            System.out.println(reader.readByte());
            System.out.println(reader.readShort());
            System.out.println(reader.readInt());
            System.out.println(reader.readLong());
            System.out.println(reader.readDouble());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
