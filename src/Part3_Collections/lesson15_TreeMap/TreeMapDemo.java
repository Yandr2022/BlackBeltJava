package Part3_Collections.lesson15_TreeMap;


import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Double, Obj> map = new TreeMap<>();
        Obj obj1 = new Obj("A", "aaa", 1);
        Obj obj2 = new Obj("B", "bbb", 2);
        Obj obj3 = new Obj("C", "ccc", 3);
        map.put(1.5, obj2);
        map.put(0.5, obj3);
        map.put(1.0, obj1);
        map.put(2.0, obj1);
        System.out.println(map + "\n");

        System.out.println(map.put(1.5, obj3));
        System.out.println(map + "\n");

        for (Double key : map.descendingKeySet()) {
            System.out.println(map.get(key));
        }

        System.out.println("\n" + map.remove(1.5));
        System.out.println(map + "\n");

        System.out.println(map.descendingMap() + "\n");

        System.out.println(map.tailMap(1.0));
        System.out.println(map.tailMap(1.0, false) + "\n");

        System.out.println(map.headMap(1.0));
        System.out.println(map.headMap(1.0, true) + "\n");

        System.out.println(map.lastEntry());
        System.out.println(map.firstEntry() + "\n");

        TreeMap<Obj, String> map1 = new TreeMap<>();
        map1.put(obj1, "X");
        map1.put(obj2, "Y");
        map1.put(obj3, "Z");
        System.out.println(map1);

    }
}

final class Obj implements Comparable<Obj> {
    private final String name;
    private final String bio;
    private final int id;


    public Obj(String name, String bio, int id) {
        this.name = name;
        this.bio = bio;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return id == obj.id && Objects.equals(name, obj.name) && Objects.equals(bio, obj.bio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bio, id);
    }

    @Override
    public int compareTo(Obj o) {
        return id - o.id;
    }

//    @Override
//    public int hashCode() {
//        return name.length() * 7 + bio.length() * 11 + id * 53;
//    }

}