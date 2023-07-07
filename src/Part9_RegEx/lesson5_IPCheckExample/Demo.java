package Part9_RegEx.lesson5_IPCheckExample;

import java.util.regex.Pattern;

public class Demo {

    static boolean checkIP(String IP){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        //25[0-5]   |    2[0-4]\d   |   [01]?\d?\d  (\.)    {3}     25[0-5]    |   2[0-4]\d   |   [01]?\d?\d
        //250-255   |    200-249    |   0-199       .       *3      250-255    |    200-249   |   0-199
        return Pattern.matches(regex,IP);
    }
    public static void main(String[] args) {
        //0-255.0-255.0-255.0-255

        String ip1 = "255.38.192.87";
        String ip2 = "182.44.350.59";

        System.out.println(ip1 + " is IP? : " + checkIP(ip1));
        System.out.println(ip2 + " is IP? : " + checkIP(ip2));

    }
}
