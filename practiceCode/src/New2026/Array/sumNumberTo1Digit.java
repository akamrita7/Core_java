package New2026.Array;

public class sumNumberTo1Digit {
    public static void main(String[] args){
        String number = "8588863221";
        int sum = 0;
        while(sum==0) {
            for (int i = 0; i < number.length(); i++) {
                sum += number.charAt(0);
            }
            if(sum>10) {
                number = String.valueOf(sum);
                sum = 0;
            }
        }
        System.out.println(sum);
    }


}
