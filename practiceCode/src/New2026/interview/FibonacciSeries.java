package New2026.interview;

public class FibonacciSeries {
    static int n1 = 0 , n2 = 1, n3 = 0;
    static  int n = 13;

    public static void main(String[] args){
        if(n1%2==0 && (n==1 || n>1)) {
             System.out.println(n1 );
        } if(n2%2==0 && (n == 2 || n>2)){
            System.out.println(n2);
        }
        fibonacciSeries(n-2);
    }

    private static void fibonacciSeries(int n) {
        // 0 1 1 2 3 5 8
        if(n>0){
          n3 = n1+n2;
          n1= n2;
          n2 = n3;
          if(n3%2==0) {
              System.out.println(" " + n3);
          }
          fibonacciSeries(n-1);
        }
    }
}
