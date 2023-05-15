package Part3_Collections.lesson7_LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        Obj obj = new Obj("A", 1);
        Obj obj1 = new Obj("B", 2);
        Obj obj2 = new Obj("C", 1);
        Obj obj3 = new Obj("D", 3);

        LinkedList<Obj> list = new LinkedList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        System.out.println(list);
        System.out.println(list.get(2));

        list.add(new Obj("E",4));
        System.out.println(list);

        list.add(1, new Obj("A",2));
        System.out.println(list);

        list.remove(obj);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}

class Obj {
    String name;
    int num;

    public Obj(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}