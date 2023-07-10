package Part10_OtherImportantThemes.lesson5_6_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo1 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
            , NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        Class emp = Class.forName("Part10_OtherImportantThemes.lesson5_6_Reflection.Employee");
        Employee o =(Employee) emp.newInstance();//deprecated
        System.out.println(o);

        Constructor constructor = emp.getConstructor();
        o = (Employee) constructor.newInstance();
        System.out.println(o);

        Constructor<Employee> constructor1 = emp.getConstructor(int.class,String.class,String.class);
        o = constructor1.newInstance(2,"Yuli", "IT");
        System.out.println(o);

        Method method = emp.getMethod("setSalary", double.class);
        method.invoke(o, 1888.20);
        System.out.println(o);

        Emp emp1 = new Emp(10, "Ivan", "HR");
        Class empClass = emp1.getClass();
        Field field = empClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (double) field.get(emp1);
        System.out.println(salaryValue);

        field.set(emp1,1500);
        System.out.println(emp1);

    }
}
