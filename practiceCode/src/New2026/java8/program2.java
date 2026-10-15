package New2026.java8;

public class program2 {
    public static void main(String[] args){
        String s = "abcde";
        char[] ch = s.toCharArray();
        int i = 0, len = ch.length-1;
        char temp ;
        while(i<len){
           temp = ch[i] ;
           ch[i] = ch[len];
           ch[len] = temp;
           i++;
           len--;
        }
//        String str = String.join("",ch);
        System.out.println(new String(ch));

    }
}
