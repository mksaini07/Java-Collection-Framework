package Additional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOp {
    public static void main(String[] args) {


        // Intermediate operations transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        // 1. filter
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam", "Akshit");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        // no filtering at this point
        long res = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res);

        //2.Map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        //3. sorted
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sorted1 = list.stream().sorted((a,b) -> a.length() - b.length());  //using comparator

        // 4. distinct
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

        // 5. limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

        // 6. skip
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100).count());



    }
}
