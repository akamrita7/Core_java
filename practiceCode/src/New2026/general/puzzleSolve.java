package New2026.general;

/*      c|j|Z|E
        V|A|X|B
        X|N|T|U
        I|A|N|K

        [CAT, DOG , BYTE, TUBE , CAN, ANT , CAR , TANK]*/

public class puzzleSolve {
    public static void main(String[] args) {
        Character[][] puzzle = new Character[][]{{'c', 'j', 'z', 'e'}, {'v', 'a', 'x', 'b'}, {'x', 'n', 't', 'u'}, {'i', 'a', 'n', 'k'}};
        String s = "cat";
        StringBuffer row = new StringBuffer();
        StringBuffer colum = new StringBuffer();
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle.length; j++) {
                int k=0;
                if(puzzle[i][j] == s.charAt(k)) {
                    while (k < s.length()) {
                        row.append(puzzle[i + k][j]);
                        row.append(puzzle[i][j+k]);
                        row.append(puzzle[i+k][j+k]);
                        k++;
                    }
                    if(row.toString().equals(s)){
                        System.out.println(s+ " :found in row");
                    }else if(colum.toString().equals(s)){
                        System.out.println(s+ " :found in column");
                    }else{
                        System.out.println(s+ " :found in diag");
                    }
                }
            }
        }
    }
}
