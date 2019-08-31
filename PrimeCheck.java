
public class PrimeCheck {

	private int flag=0;
	public  void prime(int num){
		for (int i = 1; i < num; i++) {
			for (int j = 2; j < i-1; j++) {
				if(num%j==0){
					flag=1;
					break;
				}
			}
		}
		if(flag==0){
			System.out.println("Number is prime");
		}else{
			System.out.println("Number is not prime");
		}
	}




}
