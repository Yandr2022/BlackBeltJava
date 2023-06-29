package Part8_IO_NIO_Files.lesson1_StreamsIntroduction_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда открытая мной.";
        String s = "Hello\n";
        FileWriter writer = null;
        try {
//            writer = new FileWriter("C:/Users/User/Desktop/test2.txt");
//            writer = new FileWriter("test2.txt");//project root
            writer = new FileWriter("C:\\Users\\User\\IdeaProjects\\demo\\BlackBeltJava\\src" +
                    "\\Part8_IO_NIO_Files\\lesson1_StreamsIntroduction_FileWriter\\test2.txt",true);
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
            writer.write(s);
            writer.write(rubai);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
