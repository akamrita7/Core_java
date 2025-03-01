package applyPrac;
//https://www.geeksforgeeks.org/round-the-given-number-to-nearest-multiple-of-10/
public class RoundToNearest {
    public static void main(String[] args) {
        System.out.println(4720==roundto(4722));
        System.out.println(40==roundto(38));
        System.out.println(10==roundto(10));
    }

    private static int roundto(int n) {
        int a = (n/10)*10;
        int b = a+10;
        return (n - a >= b - n)? b : a;
    }
}
