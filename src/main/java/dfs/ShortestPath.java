package dfs;
// see the full question at the end of the code
public class ShortestPath {
	static int dfs(int temp, int[][] grid, int i, int j, int tr, int tc, int path) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
			path = Integer.MAX_VALUE;
			return path;
		}
		grid[i][j] = 0;
		if (tr == i && tc == j) {
			path = Math.min(path, temp);
			return path;
		} else {
			path = Math.min(path, dfs(temp + 1, grid, i, j + 1, tr, tc, path));
			path = Math.min(path, dfs(temp + 1, grid, i, j - 1, tr, tc, path));
			path = Math.min(path, dfs(temp + 1, grid, i + 1, j, tr, tc, path));
			path = Math.min(path, dfs(temp + 1, grid, i - 1, j, tr, tc, path));
			return path;
		}

	}

	static int shortestCellPath(int[][] grid, int sr, int sc, int tr, int tc) {
		int path = Integer.MAX_VALUE;
		path = Math.min(path, dfs(0, grid, sr, sc, tr, tc, path));
		path = path == Integer.MAX_VALUE ? -1 : path;
		return path;

	}

	public static void main(String[] args) {
		int grid[][] = { 
				{ 1, 1, 1, 1 }, 
				{ 0, 0, 0, 1 }, 
				{ 1, 1, 1, 1 } };
		System.out.println(shortestCellPath(grid, 0, 0, 2, 0));
	}
}
/*
 Shortest Cell Path
In a given grid of 0s and 1s, we have some starting row and column sr, sc and a target row and column tr, tc. Return the length of the shortest path from sr, sc to tr, tc that walks along 1 values only.

Each location in the path, including the start and the end, must be a 1. Each subsequent location in the path must be 4-directionally adjacent to the previous location.

It is guaranteed that grid[sr][sc] = grid[tr][tc] = 1, and the starting and target positions are different.

If the task is impossible, return -1.

Examples:

input:
grid = [[1, 1, 1, 1], [0, 0, 0, 1], [1, 1, 1, 1]]
sr = 0, sc = 0, tr = 2, tc = 0
output: 8
(The lines below represent this grid:)
1111
0001
1111

grid = [[1, 1, 1, 1], [0, 0, 0, 1], [1, 0, 1, 1]]
sr = 0, sc = 0, tr = 2, tc = 0
output: -1
(The lines below represent this grid:)
1111
0001
1011
Constraints:

[time limit] 5000ms
[input] array.array.integer grid
1 ≤ arr.length = arr[i].length ≤ 10
[input] integer sr
[input] integer sc
[input] integer tr
[input] integer tc
All sr, sc, tr, tc are valid locations in the grid, grid[sr][sc] = grid[tr][tc] = 1, and (sr, sc) != (tr, tc).
[output] integer 
 */
