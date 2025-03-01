package applyPrac;

public class tech {
    public static void main(String[] args) {
//        int[] input = {-7, 1, 5, 2, -4, 3, 0}; //3
        int[] input = {1, 2, 3}; //-1
        System.out.println(findEquilibrium(input));

    }

    private static int findEquilibrium(int[] input) {
        int len = input.length-1;
        int start = 0;
        int left = 0;
        int right = 0;
        while (start<len){
            left = left + input[start++];
            right = right + input[len--];
            if(left == right){
                return start;
            }
        }
        return -1;
    }
}
