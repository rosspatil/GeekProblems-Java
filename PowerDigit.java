import java.math.BigInteger;
import java.util.Scanner;

public class PowerDigit {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		BigInteger bigInteger1=new BigInteger(sc.next());
		System.out.println("Enter power");
		int power=sc.nextInt();
		double pow=1;
		BigInteger bigInteger=new BigInteger("1");
		for (int i = 0; i < power; i++) {
			
			bigInteger=bigInteger.multiply(bigInteger1);
		}
		String str=""+bigInteger;
		long sum=0;
		for (int i = 0; i < str.length(); i++) {
			sum+=Integer.parseInt(""+str.charAt(i));
		}
		System.out.println(sum);
	}

}
