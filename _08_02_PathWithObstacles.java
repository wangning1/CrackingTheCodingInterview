import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _08_02_PathWithObstacles {

    boolean hasRes = false;
    List<List<Integer>> res = new ArrayList<>();
    boolean[][] visited;

    public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {
        visited = new boolean[obstacleGrid.length][obstacleGrid[0].length];
        backtrack(obstacleGrid, 0, 0, new LinkedList<>());
        return res;
    }

    private void backtrack(int[][] grid, int row, int col, LinkedList<List<Integer>> path) {
        if (hasRes) {
            return;
        }

        if (row >= grid.length || col >= grid[0].length) {
            return;
        }

        if (grid[row][col] == 1) {
            return;
        }
        if(visited[row][col]){
            return;
        }
        List<Integer> point = new ArrayList<>();
        point.add(row);
        point.add(col);
        path.addLast(point);
        visited[row][col] = true;
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            //加入结果
            res.addAll(path);
            hasRes = true;
            return;
        }

        //向右
        backtrack(grid, row + 1, col, path);
        //向下
        backtrack(grid, row, col + 1, path);
        visited[row][col] = false;
        path.removeLast();
    }
}
