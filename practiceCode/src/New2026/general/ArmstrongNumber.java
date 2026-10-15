package New2026.general;

//https://www.javatpoint.com/armstrong-number-in-java

/*153: 13 + 53 + 33 = 1 + 125+ 27 = 153

        125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

        1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643*/
public class ArmstrongNumber {
    public static void main(String[] args){
        int n = 153;
        int temp = n;
        int p = 0;
        while (n>0){
            int rem = n%10;
            p += rem*rem*rem;
            n = n/10;
        }
        if(p==temp){
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                    "No. It is not an Armstrong No.");
        }

    }
}
