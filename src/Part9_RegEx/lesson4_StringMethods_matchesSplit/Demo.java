package Part9_RegEx.lesson4_StringMethods_matchesSplit;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        String s = "Andryushchanka Yulia, Belarus, Minsk, Nemiga street, 10, Flat 22, email: sharkievich@gmail.com," +
                "Post code: BE087, Phone number: +123456789; Petrova Maria, Ukraine, Kiev, Lomonosov street, 25," +
                "Flat 33, email: petrM@mail.ru, Post code: UK0358, Phone number: +876543210; Chuck Norris, USA, Hollywood," +
                " AllStars street, 128," +
                "Flat 45, email: chuckNorris@gmail.com, Post code: USA8756, Phone number: +927563124. ";

        String s1 = "chuckNorris@gmail.com";
        System.out.println(s1.matches("\\w+@\\w+\\.(com|ru)"));

        for (String el:s.split(";")) {
            System.out.println(el);
        }

    }
}
