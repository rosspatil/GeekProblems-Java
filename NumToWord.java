import java.util.Scanner;

public class NumToWord {

	static String numberArray[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String  num=sc.next();
		StringBuffer buffer=new StringBuffer();
		for (int i = 0; i < num.length(); i++) {
			int a =Integer.parseInt(""+num.charAt(i));
			buffer.append(numberArray[a]+" ");
		}
		System.out.println(buffer);
	}
}
