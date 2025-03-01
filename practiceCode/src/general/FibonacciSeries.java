package general;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
            int n = 10; // Number of Fibonacci numbers to generate
            System.out.println("Fibonacci Series:");
            var fibonacci = Stream.iterate(new Pair(0, 1), pair -> new Pair(pair.second(), pair.first() + pair.second()))
                    .limit(n)
                    .map(Pair::first)
                    .toList();
            System.out.println(fibonacci);
            AtomicInteger  count = new AtomicInteger(0);
            Stream.generate(count::getAndIncrement).limit(5).forEach(System.out::println);
        }

        public record Pair(int first, int second) {} //record generate @data
    }
