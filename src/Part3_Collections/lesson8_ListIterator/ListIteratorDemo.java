package Part3_Collections.lesson8_ListIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        String str = "madam2";
        List<Character> list = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.printf("%s is %s Palindrome", str,( isPalindrome ? "" : "not"));


    }
}
