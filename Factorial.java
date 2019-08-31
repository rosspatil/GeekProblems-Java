
public class Factorial {

	public void fact(int num){
		int fact=1;
		for (int i = num; i > 0; i--) {
			fact*=i;
		}
		System.out.println("Factorial:"+fact);
	}
	
}
