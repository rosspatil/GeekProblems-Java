import java.util.HashMap;
import java.util.HashSet;

public class Table {




	public  Table(){
		for (int i = 0; i < 1000; i++) {
			if(i<10){
				System.out.printf("%d\n",i);
			}
			else if(i>=10 && i<100){
				int a=i/10;
				int b=i%10;
				if(i==(a*a+b*b)){
					System.out.printf("%d\n",i);
				}
			}else if(i>=100 && i<1000){
				int a=i/100;
				int b=i%100/10;
				int c=i%100%10;
				if(i==(a*a*a+b*b*b+c*c*c)){
					System.out.printf("%d\n",i);
				}	
			}
		}
		
	}

	public static void main(String[] args) {
		new  Table();
	}

}
