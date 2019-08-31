import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximumTotal {
	
	static int[][] triangle=new int[15][15];
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("E://triangle.txt"));
		int num=7;
		for (int i = 1; i <= 15; i++) {
			for (int j = 1; j <=num; j++,num--) {
				triangle[i-1][j-1]=0;
			}
			for (int j = 0; j < 1; j++) {
				
			}
			
		}
	}

}
