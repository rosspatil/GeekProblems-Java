
public class MatrikOutletProblem {
	private static void changeDir() {
		if (dir <3) {
			dir++;
		} else {
			dir = 0;
		}
	}

	static int matrix[][] = { { 0, 1, 1, 0 ,0}, { 1, 0, 0, 1,1 }, { 1, 0, 1, 0,0 }, { 1, 1, 0, 1,1 } };
	static int dir = 0;

	public static void main(String[] args) {

		int y = 0;
		int x = 0;
		int m=5,n=4;

		while (true) {
			switch (dir) {

			case 0: {
				boolean exe=false;
				for (int i = y; i < m; i++) {
					if (matrix[x][i] == 1) {
						matrix[x][i] = 0;
						changeDir();
						exe=true;
						y = i;
						break;
					}

				}
				if(!exe){
					System.out.println("end up x="+x+" y="+(m-1));
					return;
				}
			}
			break;
			case 1: {
				boolean exe=false;
				for (int i = x; i < n; i++) {
					if (matrix[i][y] == 1) {
						matrix[i][y] = 0;
						changeDir();
						exe=true;
						x = i;
						break;
					}

				}
				if(!exe){
					System.out.println("end up x="+(n-1) +" y="+y);
					return;
				}
			}
			break;
			case 2: {
				boolean exe=false;
				for (int i = y; i >= 0; i--) {
					if (matrix[x][i] == 1) {
						matrix[x][i] = 0;
						changeDir();
						exe=true;
						y = i;
						break;
					}

				}
				if(!exe){
					System.out.println("end up x="+x+" y=0");
					return;
				}
			}
			break;
			case 3: {
				boolean exe=false;
				for (int i = x; i >= 0; i--) {
					if (matrix[i][y] == 1) {
						matrix[i][y] = 0;
						changeDir();
						exe=true;
						x = i;
						break;
					}

				}
				if(!exe){
					System.out.println("end up x=0 y="+y);
					return;
				}
			}
			break;
			}
		}
	}

}
