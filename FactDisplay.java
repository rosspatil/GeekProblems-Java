import java.util.Scanner;


public class FactDisplay {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		Factorial fact=new Factorial();
		fact.fact(num);
	}
}
