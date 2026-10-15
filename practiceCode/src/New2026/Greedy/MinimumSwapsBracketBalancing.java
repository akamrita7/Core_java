package New2026.Greedy;
//https://www.geeksforgeeks.org/dsa/minimum-swaps-bracket-balancing/
/*Input : s = "[]][]["
Output : 2
Explanation : First swap Position 3 and 4 "[][]][" and Second swapPosition 5 and 6 "[][][]"

Input : s = "[[][]]"
Output : 0
Explanation : The string is already balanced.*/
public class MinimumSwapsBracketBalancing {

    public static void main(String args[])
    {
        String s = "[]][][";
        System.out.println(swapCount(s) );//2
        System.out.println(swapCount("[[][]]") ); //0

    }

    private static int swapCount(String s) {
        int swap = 0 ; int imbalance = 0;
        int right =  0 ; int left = 0 ;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '['){
                left ++;
                if(imbalance > 0){
                    swap += imbalance;
                    imbalance--;
                }
            }else{
                right++;
                imbalance = right -left;
            }
        }
        return swap;
    }
}
