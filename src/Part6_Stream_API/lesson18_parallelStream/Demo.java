package Part6_Stream_API.lesson18_parallelStream;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sum = list.stream().reduce((acc,el)->acc + el).get();
        System.out.println("sum: "+sum);

        double sum2 = list.parallelStream().reduce((acc,el)->acc + el).get();
        System.out.println("sum: "+sum2);

        double div = list.stream().reduce((acc,el)->acc/el).get();
        System.out.println("div: "+div);

        double div2 = list.parallelStream().reduce((acc,el)->acc/el).get();
        System.out.println("div: "+div2);//!!!order is important=>wrong result
    }
}
