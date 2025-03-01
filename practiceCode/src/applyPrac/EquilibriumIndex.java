package applyPrac;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0}; //sum of left == sum of right
//        int[] arr = {1, 2, 0, 3};
        System.out.println(findEquilibrium(arr));
    }
    private static int findEquilibrium(int[] arr) {
        int prefSum = 0, total = 0;
        for (int ele : arr) {
            total += ele;
        }
        for (int pivot = 0; pivot < arr.length; pivot++) {
            int suffSum = total - prefSum - arr[pivot];
            if (prefSum == suffSum) {
                return pivot;
            }
            prefSum += arr[pivot];
        }
        return -1;
    }
    static int findEquilibrium1(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        pref[0] = arr[0];
        suff[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++)
            pref[i] = pref[i - 1] + arr[i];
        for (int i = n - 2; i >= 0; i--)
            suff[i] = suff[i + 1] + arr[i];
        for (int i = 0; i < n; i++) {
            if (pref[i] == suff[i])
                return i;
        }
        return -1;
    }
}
