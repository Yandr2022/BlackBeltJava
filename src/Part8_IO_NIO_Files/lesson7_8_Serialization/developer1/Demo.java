package Part8_IO_NIO_Files.lesson7_8_Serialization.developer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();
        employees.add("Yuli");
        employees.add("Ivan");
        employees.add("Svetlana");
        employees.add("Georg");
        employees.add("Natali");
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream("src/Part8_IO_NIO_Files/lesson7_Serialization/employeeNames.bin"))) {
            stream.writeObject(employees);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
