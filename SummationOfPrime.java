
public class SummationOfPrime {

	public static void main(String[] args) {
		long ans=0;
		
		for (int i = 2; i < 2000000; i++) {
			int flag=0;
			for (int j = 2; j <= i/2; j++) {
				if(i%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				ans+=i;
				System.out.println(i+" "+ans);
			}
		}
		
	}
}
