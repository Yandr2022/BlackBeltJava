package Part6_Streams.lesson7_10_MethsConcatDistinctCountPeek;

import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        Stream<Integer> stream1 = Stream.of(6,7,8,9,10);
        Stream<Integer> stream2 = Stream.concat(stream,stream1);
        stream2.forEach(System.out::print);
        System.out.println();

        Stream<Integer> stream3 = Stream.of(1,2,3,4,5,2,1,3);
        stream3.distinct().forEach(System.out::print);
        System.out.println();

        Stream<String> stream4= Stream.of("abc","def","abc");
        System.out.println(stream4.distinct().count());
//        System.out.println(stream3.count()); IllegalStateException: stream has already been operated upon or closed

        stream4 =Stream.of("abc","def","abc");
        System.out.println(stream4.distinct().peek(System.out::println).count());
    }
}
