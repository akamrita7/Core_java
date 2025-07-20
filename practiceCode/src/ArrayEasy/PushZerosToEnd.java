package ArrayEasy;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void pushZerosToEnd(int[] arr) {
        int count = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count < len){
            arr[count++] =0 ;
        }
    }
}
