package Part9_RegEx.lesson1_3_Introduction_P1_P3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) {
        String s = "Andryushchanka Yulia, Belarus, Minsk, Nemiga street, 10, Flat 22, email: sharkievich@gmail.com," +
                "Post code: BE087, Phone number: +123456789; Petrova Maria, Ukraine, Kiev, Lomonosov street, 25," +
                "Flat 33, email: petrM@mail.ru, Post code: UK0358, Phone number: +876543210; Chuck Norris, USA, Hollywood," +
                " AllStars street, 128," +
                "Flat 45, email: chuckNorris@gmail.com, Post code: USA8756, Phone number: +927563124; ";

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("******************************");

        pattern = Pattern.compile("\\b\\d{2}\\b");
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("******************************");

        pattern = Pattern.compile("\\+\\d{9}");
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("******************************");

        pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
