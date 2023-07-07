package Part9_RegEx.lesson1_3_Introduction_P1_P3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String s = "ABCD ABCE ABCFABCGABCH";
        Pattern pattern1 = Pattern.compile("ABCD");
        Matcher matcher = pattern1.matcher(s);
        System.out.printf("\"%s\", \"ABCD\"\n", s);
        while (matcher.find()) {
            System.out.printf("%d: %s\n", matcher.start(), matcher.group());
        }
        System.out.println("************************************");

        System.out.printf("\"%s\", \"ABC\"\n", s);
        pattern1 = Pattern.compile("ABC");
        matcher = pattern1.matcher(s);
        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        s = "pdJKHiuBhjkChJklDe";
        System.out.printf("\"%s\", \"[ABCD]\"\n", s);
        pattern1 = Pattern.compile("[ABCD]");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        s = "ABDOP_AIBDOP_ABCOP_ABKOP_ABFUP_ABFOP";
        System.out.printf("\"%s\", \"AB[C-F]OP\"\n", s);
        pattern1 = Pattern.compile("AB[C-F]OP");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        s = "abcd abceabc5abcg6abch ";
        System.out.printf("\"%s\", \"abc[e-g4-7]\"\n", s);
        pattern1 = Pattern.compile("abc[e-g4-7]");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        System.out.printf("\"%s\", \"abc[^e-g4-7]\"\n", s);
        pattern1 = Pattern.compile("abc[^e-g4-7]");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        System.out.printf("\"%s\", \"abc(e|5)\"\n", s);
        pattern1 = Pattern.compile("abc(e|5)");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        System.out.printf("\"%s\", \"abc.\"\n", s);
        pattern1 = Pattern.compile("abc.");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        System.out.printf("\"%s\", \"^abc\"\n", s);
        pattern1 = Pattern.compile("^abc");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        System.out.printf("\"%s\", \"6abch $\"\n", s);
        pattern1 = Pattern.compile("6abch $");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }

        System.out.println("\n*************************************");

        System.out.printf("\"%s\", \"\\d\"\n", s);
        pattern1 = Pattern.compile("\\d");//[0-9]
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        System.out.printf("\"%s\", \"\\D\"\n", s);
        pattern1 = Pattern.compile("\\D");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        System.out.printf("\"%s\", \"\\w\"\n", s);//[A-Za-z_]
        pattern1 = Pattern.compile("\\w");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        System.out.printf("\"%s\", \"\\W\"\n", s);
        pattern1 = Pattern.compile("\\W");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        s = "abcd abce abc5 abcg6abch ";
        System.out.printf("\"%s\", \"\\w+\"\n", s);
        pattern1 = Pattern.compile("\\w+");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        s = "abc d abcedefghij abc 5 abcg 6ab ch ";
        System.out.printf("\"%s\", \"\\w{3}\"\n", s);
        pattern1 = Pattern.compile("\\w{3}");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }

        System.out.println("\n*************************************");

        s = "abc d    abcedefghij   abc_ 5? abcg 6ab ch ";
        System.out.printf("\"%s\", \"\\w\\s+\\w\"\n", s);
        pattern1 = Pattern.compile("\\w\\s+\\w");//[\s] = [\n\t\r\f]
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        s = "abc ababcedefghij   ab ab_ 5? abcg 6ab ch ";
        System.out.printf("\"%s\", \"(ab){2,3}\"\n", s);
        pattern1 = Pattern.compile("(ab){2,3}");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        s = "DABCDABABDABABABE";
        System.out.printf("\"%s\", \"D(AB){2,}\"\n", s);
        pattern1 = Pattern.compile("D(AB){2,}");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        s = "DABCDABABDABABABEDR";
        System.out.printf("\"%s\", \"D(AB)?\"\n", s);
        pattern1 = Pattern.compile("D(AB)?");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        System.out.printf("\"%s\", \"D(AB)*\"\n", s);
        pattern1 = Pattern.compile("D(AB)*");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        s = "ABCD ABCF ABCV ABCD ABCD";
        System.out.printf("\"%s\", \"\\AABCD\"\n", s);
        pattern1 = Pattern.compile("\\AABCD");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
        System.out.println("\n*************************************");

        System.out.printf("\"%s\", \"ABCD\\Z\"\n", s);
        pattern1 = Pattern.compile("ABCD\\Z");
        matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.printf("%d: %s, ", matcher.start(), matcher.group());
        }
    }
}
