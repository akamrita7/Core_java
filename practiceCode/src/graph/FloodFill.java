package graph;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1, sc = 1, newColor = 2;
        int[][] result = floodFill(image, sr, sc, newColor);
        printArray(result);
    }

    private static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor){
            return image;
        }
        dfs(image,sr,sc,image[sr][sr],newColor);
        return image;
    }

    private static void dfs(int[][] image, int x, int y, int oldcolor, int newColor) {
        if (x < 0 || x >= image.length || y < 0 ||
                y >= image[0].length || image[x][y] !=
                oldcolor) {
            return;
        }

        image[x][y] = newColor;
        dfs(image,x+1,y,oldcolor,newColor);
        dfs(image,x-1,y,oldcolor,newColor);
        dfs(image,x,y+1,oldcolor,newColor);
        dfs(image,x,y-1,oldcolor,newColor);
    }

    private static void printArray(int[][] image) {
        for (int[] row : image){
        for (int pixel : row){
            System.out.print(pixel + " ");
        }
            System.out.println();
        }
    }
}
