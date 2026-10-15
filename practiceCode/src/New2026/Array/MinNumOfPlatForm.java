package New2026.Array;

import java.util.Arrays;

public class MinNumOfPlatForm {
    public static void main(String[] args)
    {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
//        System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));
        System.out.println("Minimum Number of Platforms Required = " + minPlatform(arr, dep));
    }
    static int minPlatform(int[] arr, int[] dep) {
        int n = arr.length;
        int res = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int j = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && dep[j] < arr[i]) {
                cnt--;
                j++;
            }
            cnt++;
            res = Math.max(res, cnt);
        }
        return res;
    }

    private static Integer findPlatform(int[] arr, int[] dep, int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat_needed = 0, j = 0 , i = 1 , result = 1;
        while ((i<n && j<n)){
            if(arr[i]<=dep[j]){
                plat_needed++;
                i++;
            }else if (arr[i]>dep[j]){
                if(plat_needed>0) {
                    plat_needed--;
                }
                j++;

            }
            if(plat_needed>result){
                result = plat_needed;
            }
        }

        return result ;
    }
}
