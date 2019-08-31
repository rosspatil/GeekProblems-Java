import java.util.Scanner;

public class HighestInNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		int one=0;
		int two;
		for (int i = 0; i < num.length()-2; i++) {
			int first=Integer.parseInt(""+num.charAt(i));
			int second=Integer.parseInt(""+num.charAt(i+1));
			int third=Integer.parseInt(""+num.charAt(i+2));
			two=first*100+second*10+third;
//			two=first*10+second;
			if(one<two){
				one=two;
			}
		}
		System.out.println("Highest two digit is: "+one);
	}

}
