package MediumProblemsArray;

public class MissingNumber {
    public static void main(String[] args) {
//        int[] arr = {2, -3, 4, 1, 1, 7};
        int[] arr = {-8, 0, -1, -4, -3};
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr) {
        int len = arr.length-1;
        boolean[] vis = new boolean[len];
        for (int i = 0; i < len; i++) {
            if(arr[i]>0 && arr[i]<len){
                vis[arr[i]-1] = true;
            }
        }
        for (int i = 1; i < len; i++) {
            if(!vis[i]){
                return i;
            }
        }
        return len+1;
    }
}
