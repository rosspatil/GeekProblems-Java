package digittoword;
import java.util.Scanner;

public class DigitToWord {
	static String tyArray[]={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
	static String teenArray[]={"ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
	static String numberArray[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer buffer=new StringBuffer();
		long count=0;
		for (int i = 1; i <= 1000; i++) {
			int size=(""+i).length();
			String word=wordForm(size, i);
			System.out.println(word);
			count+=word.trim().length();
		}
		System.out.println(count);
		
	}

	static String wordForm(int size, int num){
		if(size==1){
			return numberArray[num];
		}else if(size==2){
			int a=num%10;
			int b=num/10;
			if(a!=0){
				if(b>=2)
					return tyArray[b-2]+wordForm((""+a).length(), a);
				else
					return (teenArray[a]);
			}else{
				if(b>=2)
					 return tyArray[b-2];
					else
						return (teenArray[a]);
			}
		}else if(size==3){
			int a=num%100;
			int b=num/100;
			if(a!=0)
				return numberArray[b]+"hundredand"+ wordForm((""+a).length(), a);
			return numberArray[b]+"hundred";
		}else if(size==4){
			int a=num%1000;
			int b=num/1000;
			if(a!=0)
				return numberArray[b]+"thousand"+wordForm((""+a).length(), a);
			return numberArray[b]+"thousand";
		}else if(size==5){
			int a=num%1000;
			int b=num/1000;

			if(a!=0)
				return wordForm(2,b)+"thousand"+wordForm((""+a).length(), a);
			return wordForm(2,b)+"thousand";
		}else if(size==6){
			int a=num%100000;
			int b=num/100000;
			if(a!=0)
				return numberArray[b]+" lac "+wordForm((""+a).length(), a);
			return numberArray[b]+" lac";
		}else if(size==7){
			int a=num%100000;
			int b=num/100000;

			if(a!=0)
				return wordForm(2,b)+" lac "+wordForm((""+a).length(), a);
			return wordForm(2,b)+" lac";
		}else if(size==8){
			int a=num%10000000;
			int b=num/10000000;
			if(a!=0)
				return numberArray[b]+" crore "+wordForm((""+a).length(), a);
			return numberArray[b]+" crore";
		}else if(size==9){
			int a=num%10000000;
			int b=num/10000000;

			if(a!=0)
				return wordForm(2,b)+" crore "+wordForm((""+a).length(), a);
			return wordForm(2,b)+" crore";
		}
		else if(size==10){
			int a=num%1000000000;
			int b=num/1000000000;
			if(a!=0)
				return numberArray[b]+" arab "+wordForm((""+a).length(), a);
			return numberArray[b]+" arab";
		}else if(size==11){
			int a=num%1000000000;
			int b=num/1000000000;

			if(a!=0)
				return wordForm(2,b)+" arab "+wordForm((""+a).length(), a);
			return wordForm(2,b)+" arab";
		}
		return null;
	}
}
