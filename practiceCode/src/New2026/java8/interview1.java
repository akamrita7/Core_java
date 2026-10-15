package New2026.java8;

public class interview1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,7};
        System.out.println(findPick(arr));

    }

    private static int findPick(Integer[] arr) {
        int len = arr.length-1;
        if(len<1){
          return 0;
        }
        if(arr[0]>arr[1])return 0;
        for (int i = 1 ; i< arr.length-2; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
             return i;
            }
        }
        if(arr[len]>arr[len-1])return len-1;
        return -1;
    }
}
