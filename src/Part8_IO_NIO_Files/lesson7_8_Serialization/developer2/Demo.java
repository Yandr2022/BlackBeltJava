package Part8_IO_NIO_Files.lesson7_8_Serialization.developer2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> employees;

        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream("src/Part8_IO_NIO_Files/lesson7_Serialization/employeeNames.bin"))) {
            employees = (ArrayList<String>) stream.readObject();
            System.out.println(employees);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
