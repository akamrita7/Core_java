package New2026.interview;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

/*Input: S = "xoov"
        Output: "xov"
        Explanation: Only keep the first
        occurrence*/
public class interview2 {
    public static void main(String[] args) throws IOException {
    /*String str = "xoov";
    StringBuffer sb = new StringBuffer();
    str.chars().distinct().forEach( i -> sb.append((char)i));
        System.out.println(sb.toString());*/
        //InputStreamReader reader = new InputStreamReader(System.in , StandardCharsets.UTF_8);
        //BufferedReader in = new BufferedReader(reader);
        //String line = in.readLine();
        String line = "1,2,3,4,5;2";
        int k = Integer.parseInt(line.substring(line.indexOf(";")+1,line.length()));
        int[] lin = new int[]{1,2,3,4,5};
        int[] aar3 = new int[lin.length];
        int j = lin.length-1;
        Arrays.stream(lin).forEach(System.out::println);
        String str = "xoov";
        Arrays.stream(str.split(""))
                .distinct().toList().forEach(System.out::print);
}
}
