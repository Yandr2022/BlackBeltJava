package Part10_OtherImportantThemes.lesson3_4_classScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner
                (new File("src/Part10_OtherImportantThemes/lesson3_4_classScanner/test.txt"));){
            Set<String> strings = new TreeSet<>();
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()){
                strings.add(scanner.next());
            }
            System.out.println(strings);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
