package New2026.interview;

public class CountWordInSentence {
    public static void main(String[] args){
        String word = "Today is saturday";
        countWords(word);
    }

    private static void countWords(String word) {
        int count = 1;
        for (int i=0; i<word.length();i++){
            if(word.charAt(i)== ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
