package MediumProblemsArray;

import java.util.ArrayList;
import java.util.List;

public class CommonElements3SortedArrays {
    public static void main(String[] args)
    {
        int[] arr1 = { 1, 5, 10, 20, 30 };
        int[] arr2 = { 5, 13, 15, 20 };
        int[] arr3 = { 5, 20 };

        List<Integer> common
                = commonElements(arr1, arr2, arr3);

        if (common.size() == 0)
            System.out.print(-1);
        for (int i = 0; i < common.size(); i++)
            System.out.print(common.get(i) + " ");
    }

    private static ArrayList<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3) {
        ArrayList<Integer> common = new ArrayList<>();
        int i = 0 , j = 0 , k = 0 ;
        while(i < arr1.length && j < arr2.length && k <arr3.length){
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                common.add(arr1[i]);
                i++;
                j++;
                k++;
                while ( i < arr1.length && arr1[i] == arr1[i - 1] ) {
                    i++;
                }
                while ( j < arr2.length && arr2[j] == arr2[j - 1]  ) {
                    j++;
                }
                while (i < arr3.length && arr3[k] == arr3[k - 1]  ) {
                    k++;
                }
            } else if (arr1[i] < arr2[j]){
                i++;
            } else if (arr2[j] < arr3[ k]) {
                j++;
            }else{
                k++;
            }

        }
        return common;
    }
}
