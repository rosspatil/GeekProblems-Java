
public class SpiralMatrix {
	
	static int[][] matrix={{1,2,3,4},{8,7,6,5}};

	public static void main(String[] args) {
		int cnt=8;
		int p=0,q=0,r=2,s=4;
		while(cnt!=0){
			for (int i = q; i < s; i++) {
				System.out.print(matrix[p][i]+" ");
				cnt--;
			}
			p++;
			for (int i = p; i < r; i++) {
				System.out.print(matrix[i][s-1]+" ");
				cnt--;
				
			}
			s--;
			for (int i =s-1;i>=q; i--) {
				System.out.print(matrix[r-1][i]+" ");
				cnt--;
			}
			r--;
			for (int i =r-1;i>=p; i--) {
				System.out.print(matrix[i][q]+" ");
				cnt--;
			}
			q++;
		}
	}
}
