package Part10_OtherImportantThemes.lesson7_Annotations;

import java.lang.annotation.*;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("Part10_OtherImportantThemes.lesson7_Annotations.Xiaomi");
        Annotation annotation = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println(smartPhone.companyCreationYear() + " " + smartPhone.OS() + " " + smartPhone.annotationType());

        Class iPhoneClass = Class.forName("Part10_OtherImportantThemes.lesson7_Annotations.Iphone");
        smartPhone = (SmartPhone) iPhoneClass.getAnnotation(SmartPhone.class);
        System.out.println(smartPhone.companyCreationYear() + " " + smartPhone.OS() + " " + smartPhone.annotationType());
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {

    String OS() default "Android";

    int companyCreationYear() default 2010;

}

@SmartPhone
class Xiaomi {

    String model;
    double price;
}

@SmartPhone(OS = "IOS", companyCreationYear = 1976)
class Iphone {

    String model;
    double price;
}