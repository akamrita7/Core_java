package New2026.Greedy;
//https://www.geeksforgeeks.org/dsa/policemen-catch-thieves/
import java.util.ArrayList;
import java.util.List;

public class PoliceCatchThieve {
    public static void main(String args[])
    {
        int k, n;
        char arr1[] = new char[] { 'P', 'T', 'T', 'P', 'T' };
        k = 2;
        n = arr1.length;
        //System.out.println("Maximum thieves caught: " + policeThief(arr1, n, k));

        char arr2[] = new char[] { 'T', 'T', 'P', 'P', 'T', 'P' };
        k = 2;
        n = arr2.length;
//        System.out.println("Maximum thieves caught: " + policeThief(arr2, n, k));

        char arr3[] = new char[] { 'P', 'T', 'P', 'T', 'T', 'P' };
        k = 3;
        n = arr3.length;
//        System.out.println("Maximum thieves caught: " + policeThief(arr3, n, k));
        System.out.println("Maximum thieves caught: " + catchThieves(arr3,  k));
    }

    private static int policeThief(char[] arr1, int n, int k) {
        int res = 0;
        List<Integer> thi = new ArrayList<>();
        List<Integer> pol = new ArrayList<>();
        for (int i = 0 ; i < arr1.length; i++){
            if(arr1[i] == 'P'){
                pol.add(i);
            }else if(arr1[i] == 'T'){
               thi.add(i);
            }
        }
        int p = 0 , t = 0;
        while(p< pol.size() && t<pol.size()){
            if(Math.abs(thi.get(p++)-pol.get(t++) )<= k){
                res++;
            }else if(thi.get(t)<pol.get(p)){
                t++;
            }else {
                p++;
            }
        }
        return res;
    }
    //2 pointer aaproach
    static int catchThieves(char[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0;
        int count = 0;
        while (i < n && j < n) {
            while (i < n && arr[i] != 'P') i++;
            while (j < n && arr[j] != 'T') j++;
            if (i < n && j < n && Math.abs(i - j) <= k) {
                count++;
                i++;
                j++;
            }
            else if (j < n && j < i) {
                j++;
            }
            else if (i < n && i < j) {
                i++;
            }
        }
        return count;
    }
}
