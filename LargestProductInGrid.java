import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LargestProductInGrid {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new FileInputStream("E://grid.txt"));
		int[][] array=new int[20][20];
		int tmp=0;
		int tmp1;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				array[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20-3; j++) {
				tmp1=array[i][j]*array[i][j+1]*array[i][j+2]*array[i][j+3];
				if(tmp1>tmp){
					tmp=tmp1;
				}
			}
		}
		for (int j = 0; j < 20; j++) {
			for (int i = 0; i < 20-3; i++) {
				tmp1=array[i][j]*array[i+1][j]*array[i+2][j]*array[i+2][j];
				if(tmp1>tmp){
					tmp=tmp1;
				}
			}
		}
		
		for (int i = 0; i < 20-3; i++) {
			for (int j = 0; j < 20-3; j++) {
				tmp1=array[i][j]*array[i+1][j+1]*array[i+2][j+2]*array[i+3][j+3];
				if(tmp1>tmp){
					tmp=tmp1;
				}
			}
		}
		for (int i = 16; i>=0; i--) {
			for (int j = 16; j>=3; j--) {
				tmp1=array[i][j]*array[i+1][j-1]*array[i+2][j-2]*array[i+3][j-3];
				if(tmp1>tmp){
					tmp=tmp1;
				}
			}
		}
		
		System.out.println(tmp);
	}

}
