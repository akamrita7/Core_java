package applyPrac;
//https://www.geeksforgeeks.org/find-zeroes-to-be-flipped-so-that-number-of-consecutive-1s-is-maximized/
public class MaxLength1afterAddk1 {
    public static void main(String[] args) {
        System.out.println(8==maxOnes(new int[]{1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}, 2));
        System.out.println(3==maxOnes(new int[]{1, 0, 1}, 1));
        System.out.println(5==maxOnes(new int[]{1, 0, 0, 1, 0, 1, 0, 1}, 2));
    }

    private static int maxOnes(int[] arr, int k) {
        int res = 0;
        int start = 0, end = 0;
        int cnt = 0;
        while (end<arr.length){
            if(arr[end] == 0) cnt++;
            while (cnt>k){
                if (arr[start] == 0) {
                    cnt--;
                }
                start++;
            }
            res = Math.max(res,(end-start+1));
            end++;
        }
        return res;
    }
}
