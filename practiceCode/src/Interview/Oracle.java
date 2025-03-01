package Interview;


import java.util.Arrays;

public class Oracle {
    public static void main(String[] args) {
        int[] arr = {1 ,9 ,7}; //{0,2,7}
//        {9,2,5,2}  0,2,3,2
        System.out.println("args = " + Arrays.toString(getLight(arr)));
        System.out.println("args = " + Arrays.toString(getLight(new int[]{9,2,5,2})));
        System.out.println("args = " + Arrays.toString(getLight(arr)));
        ;


    }

    private static int[] getLight(int[] arr) {
        int[] res = new int[arr.length];
        int len = arr.length-1;
        res[len] = arr[len];
        int max = arr[len];
        for (int i = len-1; i >=0 ; i--) {
            if(arr[i]>max){
                res[i] =  arr[i]-max;
                max = arr[i];
            }else{
               res[i] = 0;
            }
            i--;
        }
        return res;

    }


}
