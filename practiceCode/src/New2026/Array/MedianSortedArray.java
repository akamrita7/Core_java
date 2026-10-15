package New2026.Array;
//https://www.geeksforgeeks.org/median-of-two-sorted-arrays-of-different-sizes/
/*Input: ar1[] = {-5, 3, 6, 12, 15}
        ar2[] = {-12, -10, -6, -3, 4, 10}
        Output : The median is 3.
        Explanation : The merged array is :
        ar3[] = {-12, -10, -6, -5 , -3,
        3, 4, 6, 10, 12, 15},
        So the median of the merged array is 3

        Input: ar1[] = {2, 3, 5, 8}
        ar2[] = {10, 12, 14, 16, 18, 20}
        Output : The median is 11.
        Explanation : The merged array is :
        ar3[] = {2, 3, 5, 8, 10, 12, 14, 16, 18, 20}
        if the number of the elements are even,
        so there are two middle elements,
        take the average between the two :
        (10 + 12) / 2 = 11.*/

import java.util.Arrays;

public class MedianSortedArray {
    public static void main(String[] args)
    {
        int ar1[] = { 900 };
        int ar2[] = { 5, 8, 10, 20 };
        int n = ar1.length;
        int m = ar2.length;

        //System.out.println(getMedian(ar1, ar2, n, m));
        int[] arr3 = new int[n + m];
        System.arraycopy(ar1,0,arr3,0,n);
        System.arraycopy(ar2,0,arr3,n,m);
        Arrays.sort(arr3);
        System.out.println("Median = " + Solution(arr3));
    }

    private static int Solution(int[] arr3) {
        int n = arr3.length;
        if(n%2 == 0) {
            int z = n / 2;
            int e = arr3[z];
            int q = arr3[z - 1];
            return e + q / 2;
        }else{
            int z = Math.round(n/2);
            return arr3[z];
        }
    }

    private static int getMedian(int[] ar1, int[] ar2, int n, int m) {
        int i = 0 , j= 0 , m1 = -1 , m2 = -1 ;
        if((m+n)%2==1){
            for(int count = 0 ; count <= (m+n)/2 ; count++){
                if(i!=n && j!= m){
                   m1 = ar1[i]<ar2[j]? ar1[i++] :ar2[j++];
                }else if( i <n){
                    m1 = ar1[i++];
                }else{
                    m1 = ar2[j++];
                }
            }
            return m1;

        }else{
            for(int count = 0 ; count <= (m+n)/2 ; count++){
                m2 = m1;
                if(i!=n && j!= m){
                    m1 = ar1[i]<ar2[j]? ar1[i++] :ar2[j++];
                }else if( i <n){
                    m1 = ar1[i++];
                }else{
                    m1 = ar2[j++];
                }
            }
            return m1 + m2 /2;

        }
    }
}
