
package New2026.interview;

public class reverseCharArray {
    public static void main(String[] arags){
        char name[] = new char[]{'a','m','r','i','t'};

        reverseChar(name);
    }

    private static void reverseChar(char[] name) {
        int len = name.length/2;
        char temp;
        int i = 0;
        for(int j = name.length-1 ; j>= len; j--){
            temp = name[j];
            name[j] = name[i];
            name[i] = temp;
            i++;

        }
        for(int j = 0 ; j<name.length ; j++){
        System.out.println(name[j]);
        }

    }
}
