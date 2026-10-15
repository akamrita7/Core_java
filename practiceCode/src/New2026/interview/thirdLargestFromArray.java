package New2026.interview;

public class thirdLargestFromArray {

    public static void main(String[] args){
       // hread t1 = new
        Integer[] arr = {4, 3, 5,1,2,10};
        find3LargestNumber(arr);

    }

    private static void find3LargestNumber(Integer[] ar) {
       int largest = 0 , secondlargest = 0 , thirdlargest = 0;

       for(int i = 0 ;i <ar.length ; i++){
           if (largest < ar[i]) {
               thirdlargest = secondlargest;
               secondlargest = largest;
               largest = ar[i];
           } else if (secondlargest < ar[i]) {
               thirdlargest = secondlargest;
               secondlargest = ar[i];
           } else if (thirdlargest < ar[i]) {
               thirdlargest = ar[i];
           }
       }
       System.out.println(thirdlargest);
    }
}
