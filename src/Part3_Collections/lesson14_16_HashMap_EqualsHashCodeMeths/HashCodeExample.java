package Part3_Collections.lesson14_16_HashMap_EqualsHashCodeMeths;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample {

    public static void main(String[] args) {

        Map<Obj, Double> map = new HashMap<>();//init capacity 16, load factor 0.75
        Obj obj1 = new Obj("A", "aaa", 1);
        Obj obj2 = new Obj("B", "bbb", 2);
        Obj obj3 = new Obj("C", "ccc", 3);
        map.put(obj1, 0.5);
        map.put(obj2, 1.0);
        map.put(obj3, 1.5);
        System.out.println(map);

        Obj obj = new Obj("A", "aaa", 1);
        System.out.println(obj.equals(obj1));
        System.out.println(map.containsKey(obj));

        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

        for (Map.Entry<Obj, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}

final class Obj {
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

//    @Override
//    public int hashCode() {
//        return name.length() * 7 + bio.length() * 11 + id * 53;
//    }

}

