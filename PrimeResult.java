import java.util.Scanner;


public class PrimeResult {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		PrimeCheck prime=new PrimeCheck();
		prime.prime(num);
	}
}
