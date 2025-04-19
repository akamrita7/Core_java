package graph;

import java.util.*;

//https://www.geeksforgeeks.org/word-ladder-length-of-shortest-chain-to-reach-a-target-word/
//https://www.youtube.com/watch?v=tRPda0rcf8E/
public class WordsLadder {
    public static void main(String[] args) {
        String[] arr = new String[]{"poon", "plee", "same", "poie", "plie", "poin", "plea"}; //7
        String start = "toon";
        String target = "plea";
        /*String start = "abcv";
        String target = "ebad";
        String[]  arr = {"abcd", "ebad", "ebcd", "xyza"}; //4*/
        System.out.println(wordLadder(start, target, arr));
    }

    private static int wordLadder(String start, String target, String[] arr) {
        Set<String> st = new HashSet<>();
        Collections.addAll(st, arr);
        int res = 0;
        int m = start.length();
        Queue<String> words = new LinkedList<>();
        words.add(start);
        while(!words.isEmpty()){
            ++res;
            int len = words.size();
            for(int l = 0; l < len; l++) {
                String word = words.poll();
                for(int i = 0; i < m; i++) {
                    char[] wordArr = word.toCharArray();
                    char ch = wordArr[i];
                    for (char c = 'a'; c <= 'z'; ++c) {
                        wordArr[i] =c;
                        String newWord = new String(wordArr);
                        if(!st.contains(newWord))
                            continue;
                        if(newWord.equals(target))
                            return res+1;
                        st.remove(newWord);
                        words.add(newWord);
                    }
                    wordArr[i]=ch;
                }
            }

        }
        return 0;
    }
}
