package Part10_OtherImportantThemes.lesson5_6_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        Class emp = Class.forName("Part10_OtherImportantThemes.lesson5_6_Reflection.Employee");
//        Class emp = Employee.class;
//        Employee employee = new Employee();
//        Class emp = employee.getClass();
        Field field = emp.getField("id");
        System.out.println("type of field 'id': " + field.getType());
        System.out.println("***********************");

        Field[] fields = emp.getFields();//only public
        for (Field f : fields) {
            System.out.printf("%-18s:\t%-12s\n", f.getType().getName(), f.getName());
        }
        System.out.println("***********************");

        fields = emp.getDeclaredFields();//all
        for (Field f : fields) {
            System.out.printf("%-18s:\t%-12s\t%s\n", f.getType().getName(), f.getName(), f.getModifiers());
        }
        System.out.println("***********************");

        Method method = emp.getMethod("increaseSalary");//if doesn't have parameters
        System.out.println(method.getName() + " " + method.getReturnType() + " " + Arrays.toString(method.getParameterTypes()));
        method = emp.getMethod("setSalary", double.class);
        System.out.println(method.getName() + " " + method.getReturnType() + " " + Arrays.toString(method.getParameterTypes()));
        System.out.println("***********************");

       Method[] methods = emp.getMethods();
        for (Method m : methods) {
            System.out.printf("%-18s:\t%-6s\t%s\n", m.getName(), m.getModifiers(), m.getReturnType()
                    , Arrays.toString(m.getParameters()));
        }
        System.out.println("***********************");

       methods = emp.getDeclaredMethods();
        for (Method m : methods) {
            System.out.printf("%-18s:\t%-6s\t%s\n", m.getName(), m.getModifiers(), m.getReturnType()
                    , Arrays.toString(m.getParameters()));
        }
        System.out.println("***********************");

        for (Method m : methods) {
            if(Modifier.isPublic(m.getModifiers()))
            System.out.printf("%-18s:\t%-6s\t%-12s\t%s\n", m.getName(), m.getModifiers(), m.getReturnType()
                    , Arrays.toString(m.getParameters()));
        }
        System.out.println("***********************");

        Constructor constructor = emp.getConstructor();
        System.out.println(constructor.getName() + ": " + constructor.getModifiers() + ", " +  constructor.getParameterCount()
                + ", " +  Arrays.toString(constructor.getParameterTypes()));
        constructor = emp.getConstructor(int.class, String.class, String.class);
        System.out.println(constructor.getName() + ": " + constructor.getModifiers() + ", " +  constructor.getParameterCount()
                + ", " +  Arrays.toString(constructor.getParameterTypes()));
        System.out.println("************************");

        Constructor[] constructors = emp.getConstructors();
        for (Constructor c : constructors) {
                System.out.printf("%-28s:\t%-6s\t%-6s\t%s\n", c.getName(), c.getModifiers(),c.getParameterCount(),  Arrays.toString(c.getParameters()));
        }
        System.out.println("***********************");

    }
}
