
public class RatInMaze {

	static int[][] maze = new int[4][4];

	public static void main(String[] args) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				maze[i][j] = -1;
			}
		}
		maze[2][0] = maze[3][0] = maze[0][1] = maze[0][2] = maze[0][3] = maze[1][2] = maze[2][2] = 0;

		checkNeighbour(0, 0);
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				System.out.print(maze[i][j] + "\t");
			}
			System.out.println();
		}

	}

	static void checkNeighbour(int x, int y) {

		
			if (y>=1 && maze[x][y - 1] == -1) {
				maze[x][y - 1] = checkWin(x, y - 1);
				checkNeighbour(x, y - 1);
			}else if (x>=1 && maze[x - 1][y ] == -1) {
				maze[x - 1][y ] = checkWin(x - 1, y );
				checkNeighbour(x - 1, y);
			}else if (maze[x ][y + 1] == -1) {
				maze[x ][y + 1] = checkWin(x , y + 1);
				checkNeighbour(x , y + 1);
			}else if (maze[x + 1][y ] == -1) {
				maze[x + 1][y ] = checkWin(x + 1, y );
				checkNeighbour(x + 1, y);
			

		}

	}

	private static int checkWin(int x, int i) {
		if (x == 3 && i == 3) {
			return 1;
		}
		return -1;
	}

}
