package MediumProblemsArray;

import java.util.HashMap;

//https://www.geeksforgeeks.org/majority-element/
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] arr) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int maj = arr.length/2;
        for (int num : arr){
            count.put(num , count.getOrDefault(num,0)+1);
            if(count.get(num)>maj){
                return num;
            }
        }
        return -1;
    }

}
