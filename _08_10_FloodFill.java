public class _08_10_FloodFill {
    boolean[][] visited;
    int initColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        initColor = image[sr][sc];
        visited = new boolean[image.length][image[0].length];
        backtrack(image, sr, sc, newColor);
        return image;
    }

    private void backtrack(int[][] image, int sr, int sc, int newColor){

        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length){
            return;
        }

        if(visited[sr][sc]){
            return;
        }

        if(image[sr][sc] != initColor){
            return;
        }
        image[sr][sc] = newColor;
        visited[sr][sc] = true;
        backtrack(image, sr + 1, sc, newColor);
        backtrack(image, sr - 1, sc, newColor);
        backtrack(image, sr, sc + 1, newColor);
        backtrack(image, sr, sc - 1, newColor);
    }
}
