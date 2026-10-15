package New2026.StringEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.geeksforgeeks.org/dsa/minimum-distance-between-words-of-a-string/
public class MinDisBetWords {
    public static void main(String[] args) {
        String s = "geeks for geeks contribute test practice";
        String w1 = "geeks";
        String w2 = "practice";
//        System.out.println(mindistance(s, w1, w2));
        System.out.println(shortestDistance(Arrays.asList(s.split(" ")), w1, w2));

    }

    private static int mindistance(String s, String w1, String w2) {
        if(w1.equals(w2)){
            return 0;
        }
        String[] words = s.split(" ");
        int n = words.length;
        int min_dis = n +1 ;
        int j= 0,prev = 0;
        for(int i = 0 ; i < n; i++){
            if(words[i].equals(w1) || words[i].equals(w2)){
                prev = i;
                break;
            }
        }
        while (j<n){
            if(words[j].equals(w1) || words[j].equals(w2)){
                if(!words[prev].equals(words[j]) && (j-prev) < min_dis){
                    min_dis = j-prev-1;
                }
                prev = j;

            }
                j++;
        }
        return min_dis;
    }
    static int shortestDistance(List<String> list,
                                String word1, String word2)
    {
        if (word1 == word2)
            return 0;
        int ans = Integer.MAX_VALUE;
        // To store the lastposition of word1
        int lastPos = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word1) || list.get(i).equals(word2)) {
                // first occurrence of word1
                if (lastPos == -1)
                    lastPos = i;
                else {
                    // if word1 repeated again we store the
                    // last position of word1
                    if (list.get(lastPos).equals(list.get(i)))
                        lastPos = i;
                    else {
                        // find the difference of position
                        // of word1 and word2
                        ans = Math.min(ans,
                                ((i - lastPos) - 1));
                        lastPos = i;
                    }
                }
            }
        }
        return ans;
    }
}
