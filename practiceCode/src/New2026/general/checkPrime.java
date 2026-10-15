package New2026.general;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//https://stackoverflow.com/questions/36732025/printing-prime-number-from-1-to-100
public class checkPrime {
    public static void main(String[] args){
        //printPrime(50);
//        printPrime8(50);
        printPrime81(50);
    }

    private static void printPrime81(int n) {
        List<Integer> primes = new ArrayList<>();
        IntStream.range(2,n).filter(i -> primes.parallelStream().noneMatch(p -> i%p == 0)).forEach(System.out ::println);
    }

    private static void printPrime8(int n) {
                IntStream.range(2,n).filter(i -> hasNoFactors(i)).forEach(System.out::println);;
    }
    private static boolean hasNoFactors(int number) {
        return IntStream.range(2, number).noneMatch(f -> f%number==0);
    }

    private static void printPrime(int n) {
        for (int i = 2 ; i<n; i++ ){
            if(isPrime(i)){
                System.out.println(i);
            }

        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2 ; i<n; i++ ){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
