package Part3_Collections.lesson24_PriorityQueue;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class CustomPriorityDemo {
    public static void main(String[] args) {
        PriorityQueue<Obj> queue = new PriorityQueue<>();
        queue.add(new Obj("G", -2));
        queue.add(new Obj("D", 14));
        queue.add(new Obj("C", 5));
        queue.add(new Obj("B", 0));
        System.out.println(queue);
        System.out.println(queue.peek());

        PriorityQueue<Obj> queue1 = new PriorityQueue<>(Comparator.comparing(Obj::getName));
//        PriorityQueue<Obj> queue1 = new PriorityQueue<>(((o1, o2) -> o1.getName().compareTo(o2.getName())));
        queue1.add(new Obj("G", -2));
        queue1.add(new Obj("D", 14));
        queue1.add(new Obj("C", 5));
        queue1.add(new Obj("B", 0));
        System.out.println(queue1);
        System.out.println(queue1.remove());
        System.out.println(queue1);
        System.out.println(queue1.remove());
        System.out.println(queue1);

    }
}

class Obj implements Comparable<Obj> {
private final String name;
private final int id;


public Obj(String name, int id) {
        this.name = name;
        this.id = id;
        }

public String getName() {
        return name;
        }



public int getId() {
        return id;
        }

    @Override
    public String toString() {
        return "Obj{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return id == obj.id && Objects.equals(name, obj.name) ;
        }

@Override
public int hashCode() {
        return Objects.hash(name, id);
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