package Part3_Collections.lesson18_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Objects;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Double, Obj> map = new LinkedHashMap<>(16, 0.75f, true);
        Obj obj1 = new Obj("A", "aaa", 1);
        Obj obj2 = new Obj("B", "bbb", 2);
        Obj obj3 = new Obj("C", "ccc", 3);
        map.put(1.5, obj2);
        map.put(0.5, obj3);
        map.put(1.0, obj1);

        System.out.println(map);

        System.out.println(map.get(1.5));
        System.out.println(map.get(0.5));
        System.out.println(map);

    }
}

 class Obj implements Comparable<Obj> {
    private  String name;
    private  String bio;
    private  int id;


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