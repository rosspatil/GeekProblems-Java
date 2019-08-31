import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EvenlyDivisible {
	static List<Integer> list=list=new ArrayList<>();
	static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count of numbers: ");
		int cnt=sc.nextInt();
		System.out.println("Enter Numbers: ");
		for (int i = 0; i < cnt; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(factor(list.get(count),list.get(count+1)));
	}
	static int factor(int num,int num1){
		int org=num;
		while(true){
			if(count==list.size()-1){
				return num;
			}
			if(num%num1==0){
				count++;
				return factor(num, list.get(count));
			}else{
				num+=org;
			}
		}

	}

}
