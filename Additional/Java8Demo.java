package Additional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Java8Demo {
    public static void main(String[] args) {
        //Predicate -> Functional Interface(Boolean valued function)
        Predicate<Integer> isEven = x-> x%2==0;
        System.out.println(isEven.test(4));

        Predicate<String> isStartwithA = x-> x.toLowerCase().startsWith("a");
        System.out.println(isStartwithA.test("AKshit"));
        Predicate<String> isEndwithT= x-> x.toLowerCase().endsWith("t");
        System.out.println(isEndwithT.test("Test"));

        Predicate<String> and = isStartwithA.and(isEndwithT);
        System.out.println(and.test("Ankit"));
        System.out.println(and.test("Mayank"));

        //Function -> Functional Interface(Work for you)
        Function<Integer,Integer> Doubltit = x->x*2;
        System.out.println(Doubltit.apply(100));


        //Consumer
        Consumer<Integer> print = x-> System.out.println(x);
        print.accept(3);
        List<Integer> list = Arrays.asList(1,2,3);
            Consumer<List<Integer>> printlist =x->{
                for (int i:x){
                    System.out.println(i);
                }
            };
            printlist.accept(list);
        //Supplier
        Supplier<String> giveHelloWorld  = () -> "Hello world";
        System.out.println(giveHelloWorld.get());

        //Combined Example
        Predicate<Integer> predicate = x -> x%2==0;
        Function<Integer,Integer> function = x -> x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () ->100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }


        // Method reference --> use method without invoking & in place of lambda expression
        List<String> list1 = Arrays.asList("Ram", "Shyam", "Ghansyham");
        list1.forEach(x-> System.out.println(x));
        list1.forEach(System.out::println); //Method reference


    }
}
