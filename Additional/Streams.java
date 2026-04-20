package Additional;

public class Streams {
    public static void main(String[] args) {
        // feature introduced in Java 8
        // process collections of data in a functional and declarative manner
        // Simplify Data Processing
        // Embrace Functional Programming
        // Improve Readability and Maintainability
        // Enable Easy Parallelism

        //// What is stream ?
        // a sequence of elements supporting functional and declarative programing

        //// How to Use Streams ?
        // Source, intermediate operations & terminal operation

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream().filter(x -> x %2 == 0 ).count());

        //Create Stream
        // 1. Using collections
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list1.stream();

        //2. from Arrays
        String[] arr = {"a","b"};
        Stream<String> stream1 = Arrays.stream(arr);

        //3. using stream of
        Stream<String> a = Stream.of("a", "b");
        //4. Generate infinite streams
        Stream.generate(() -> 1);
        Stream.iterate(1, x -> x + 1);

    }
}
