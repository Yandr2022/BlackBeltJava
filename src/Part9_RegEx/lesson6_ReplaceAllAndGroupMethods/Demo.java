package Part9_RegEx.lesson6_ReplaceAllAndGroupMethods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

    public static void main(String[] args) {
        String s = "Java    will        save        the     world!!";
        s = s.replace("Java", "SQL");
        System.out.println(s);
        s = s.replaceAll(" {2,}", " ");
        System.out.println(s);
        s = s.replaceAll("\\bw\\w+", "777");
        System.out.println(s);
        s = s.replaceFirst("\\b\\d+", "ggg");
        System.out.println(s);

        String cardsData = "12345678987685641025876;" +
                "87563214568925680224758;" +
                "63592569748201251027124;";
        //10/25 1234 5678 9876 (876)
        Pattern  pattern =  Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(cardsData);
        String newCardsData = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        System.out.println(newCardsData);

        matcher = pattern.matcher(cardsData);
        while (matcher.find()){
            System.out.println(matcher.group(7));
        }

    }
}
