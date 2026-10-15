package New2026.StringEasy;
/*
https://www.geeksforgeeks.org/pangram-checking/
Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.
        Examples : The quick brown fox jumps over the lazy dog ” is a Pangram [Contains all the characters from ‘a’ to ‘z’]
        “The quick brown fox jumps over the dog” is not a Pangram [Doesn’t contain all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing]
*/

public class PangramChecking {
    public static void main(String[] args)
    {
        String str = "The quick brown fox jumps over the lazy dog 9 #";
//        String str = "The quick brown fox jumps over the lazy dog"; not panagram

        if (checkPangram1(str) == true)
            System.out.print(str + " ---is a panagram.");
        else
            System.out.print(str + " ---is not a panagram.");
    }
    private static boolean checkPangram1(String str) {
        str = str.toLowerCase().replaceAll("[^a-z]","");
        boolean[] marks = new boolean[26];
        for(int i = 0; i< str.length();i++){
            marks[str.charAt(i) - 'a'] = true;
        }
        for(int i = 0; i<25;i++){
            if(marks[i] == false){
                return false;
            }
        }
        return true;
    }

    private static boolean checkPangram(String str) {
        str = str.toLowerCase();
        boolean[] marks = new boolean[26];
        int index = 0;
        for(int i = 0; i< str.length();i++){
            if('A'<= str.charAt(i) && str.charAt(i)<'Z'){
                index = str.charAt(i) - 'A';
            }else if('a'<= str.charAt(i) && str.charAt(i)<'z'){
                index = str.charAt(i) - 'a';
            }else {
                continue;
            }
            marks[index] = true;
        }
        for(int i = 0; i<25;i++){
            if(marks[i] == false){
                return false;
            }
        }
        return true;
    }
}
