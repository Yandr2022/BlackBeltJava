package Part10_OtherImportantThemes.lesson3_4_classScanner;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
//        System.out.println("How are you?");
//        while (scanner.hasNext()){
//            System.out.print(scanner.next() + " ");
//        }
        System.out.println("Input two numbers:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("the result of dividing: " + x / y);
        System.out.println("remainder of dividing: " + x % y);
        scanner.close();
    }
}
