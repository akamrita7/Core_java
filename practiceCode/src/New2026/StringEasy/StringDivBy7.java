package New2026.StringEasy;

/*Input : 8955795758
        Output : Divisible by 7
        Explanation:
        We express the number in terms of triplets
        of digits as follows.
        (008)(955)(795)(758)
        Now, 758- 795 + 955 - 8 = 910, which is
        divisible by 7

        Input : 100000000000
        Output : Not Divisible by 7
        Explanation:
        We express the number in terms of triplets
        of digits as follows.
        (100)(000)(000)(000)
        Now, 000- 000 + 000 - 100 = -100, which is
        not divisible by 7*/
public class StringDivBy7 {
    public static void main(String args[])
    {
        String num = "8955795758";

        System.out.println(isDivisible7(num) ? "Divisible by 7" : "Not Divisible  by 7");
    }

    private static boolean isDivisible7(String num) {
        int len = num.length();
        if(len== 0 && num.charAt(0)=='0') return true;
        if(len%3 == 1){
            num = "00" + num;
        }
        if(len%3==2){
            num  = "0" + num;
        }
        len = num.length();
        int sum=0 , p= 1;
        for(int i=len-1; i>0 ; i--){
            int group = 0;
            group = group + (num.charAt(i)-'0') + (num.charAt(--i)-'0')*10 + (num.charAt(--i)-'0')*100;
            sum = sum + group*p;
            p = p*-1;
        }
        return sum%7==0;
    }
}
