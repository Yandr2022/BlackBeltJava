package Part3_Collections.lesson19_HashTable;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(12,"abc");
        hashtable.put(5,"kl");
        hashtable.put(8,"tyu");
        System.out.println(hashtable);

    }
}
