package New2026.Greedy;

public class MinimumRotationsUnlockCircularLock {

    public static void main (String[] args) {
        int input = 28756;
        int unlock_code = 98234;
        System.out.println("Minimum Rotation = "+ minRotation(input, unlock_code));//12
    }

    private static int minRotation(int input, int unlockCode) {

        int rotation = 0;
        int inputdigit,codeDigit;
        while (input > 0 && unlockCode>0){
            inputdigit = input%10;
            codeDigit=unlockCode%10;
            rotation += Math.min(Math.abs(inputdigit-codeDigit),10-Math.abs(inputdigit-codeDigit));
            input =input/10;
            unlockCode = unlockCode/10;
        }
        return rotation;
    }
}
