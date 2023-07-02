package Part8_IO_NIO_Files.lesson7_8_Serialization.developer2;

import Part8_IO_NIO_Files.lesson7_8_Serialization.developer1.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo1 {
    public static void main(String[] args) {
        Employee employee;

        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream("src/Part8_IO_NIO_Files/lesson7_Serialization/employee.bin"))) {
            employee = (Employee) stream.readObject();
            System.out.println(employee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
