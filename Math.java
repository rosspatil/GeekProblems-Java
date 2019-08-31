
public class Math {
	private int first,second;
	
	public Math(){
		first=10;
		second=5;
	}
	
	public int add(int  ...x){
		int sum=0;
		for (int i = 0; i < x.length; i++) {
			sum+=x[i];
		}
		return sum;
	}
	public void addition(){
		System.out.println("Addition:"+(first+second));
	}
	
	public void substraction(){
		System.out.println("Substraction:"+(first-second));
	}
	
	public void multiplication(){
		System.out.println("Multiplication:"+(first*second));
	}
	
	public void divide(){
		System.out.println("Division:"+(first/second));
	}


}
