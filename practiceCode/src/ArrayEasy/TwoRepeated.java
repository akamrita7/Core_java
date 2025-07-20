package ArrayEasy;
//https://www.geeksforgeeks.org/dsa/find-the-two-repeating-elements-in-a-given-array/
public class TwoRepeated {
    public static void main(String[] args) {
        TwoRepeated repeat = new TwoRepeated();
        int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
        int ans[] = repeat.twoRepeated(arr);
        System.out.print(ans[0] + " " + ans[1]);
    }

    private int[] twoRepeated(int[] arr) {
        int x = -1 , y = -1;
        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(count[arr[i]]==1){
                if(x==-1) {
                    x = arr[i];
                }else {
                    y = arr[i];
                }
            }else{
                count[arr[i]]++;
            }
            if ( x > 0 && y > 0){
                break;
            }
        }
        return new int[]{x,y};
    }
}
