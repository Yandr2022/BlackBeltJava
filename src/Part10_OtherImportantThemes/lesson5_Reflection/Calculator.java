package Part10_OtherImportantThemes.lesson5_Reflection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {

    void sum(int a, int b) {
        System.out.printf("sum %d & %d is %d\n", a, b, a + b);
    }

    void subtraction(int a, int b) {
        System.out.printf("subtraction %d & %d is %d\n", a, b, a - b);
    }

    void multiplication(int a, int b) {
        System.out.printf("multiplication %d & %d is %d\n", a, b, a * b);
    }

    void division(int a, int b) {
        System.out.printf("result of division %d & %d is %d\n", a, b, a / b);
    }

}

class CalcDemo {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Class calc = calculator.getClass();
        Method method = null;
        Method[] methods = calc.getDeclaredMethods();

        try (BufferedReader reader = new BufferedReader
                (new FileReader("src/Part10_OtherImportantThemes/lesson5_Reflection/test.txt"))) {
            String methodName;
            while ((methodName = reader.readLine()) != null) {
                String firstArg = reader.readLine();
                String secondArg = reader.readLine();

                for (Method m : methods) {
                    if (m.getName().equals(methodName)) {
                        method = m;
                    }
                }

                method.invoke(calculator, Integer.parseInt(firstArg), Integer.parseInt(secondArg));
            }
        } catch (IOException | InvocationTargetException | IllegalAccessException ex) {
            ex.printStackTrace();
        }

    }
}