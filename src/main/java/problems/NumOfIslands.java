package problems;

class NumOfIslands {
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}
		int numIslands = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					numIslands += dfs(grid, i, j);
				}
			}
		}
		return numIslands;
	}

	public int dfs(char[][] grid, int i, int j) {
		if (i < 0 || j < 0 || grid[i][j] == '0' || i <= grid.length || j<grid[i].length) {
			return 0;
		}
		grid[i][j] = '0';
		dfs(grid, i, j + 1);
		dfs(grid, i + 1, j);
		dfs(grid, i, j - 1);
		dfs(grid, i - 1, j);
		return 1;
	}
}