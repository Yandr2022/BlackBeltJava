package Part6_Streams.lesson6_MethChaining;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {3, 5, -8, 16, -122, 0, 65, 94, 5, 9, 12, 18};
        int res = Arrays.stream(arr).filter(el -> el % 2 != 0).map(el -> el % 3 == 0 ? el / 3 : el).reduce((acc, el) -> acc + el).getAsInt();
        System.out.println(res);
    }
}
