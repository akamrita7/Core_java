package New2026.java8.program;

import java.util.Arrays;
import java.util.List;

public class interview3 {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("ab","cd","ef");
        List<String> b = Arrays.asList("ac","kc","km");
        commonSubstring(a, b);

    }
    public static void commonSubstring(List<String> a, List<String> b) {
        for(int i = 0 ; i< a.size(); i++){
            String s1 = a.get(i);
            String s2 = b.get(i);
            boolean v[] = new boolean[26];
            Arrays.fill(v,false);
            for(int j = 0 ; j< s1.length(); j++){
                v[s1.charAt(j)-'a'] = true;
            }
            boolean flag = true;
            for(int j = 0 ; j< s2.length(); j++){
                if(v[s2.charAt(j)-'a']){
                    System.out.println("YES");
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println("No");
            }

        }

    }
}
