package Part8_IO_NIO_Files.lesson7_8_Serialization.developer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {

    public static void main(String[] args) {

        Employee employee = new Employee("Yuli", "Ivanova","IT",  2000
                , new Car("BMW", "red"));

        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream("src/Part8_IO_NIO_Files/lesson7_Serialization/employee.bin"))) {
            stream.writeObject(employee);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
