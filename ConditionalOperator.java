
public class ConditionalOperator {
	
	public void check(int num1,int num2,int num3,int num4){
		int res=(res=((num1>num2)?num1:num2)>num3?((num1>num2)?num1:num2):num3)>num4?res:num4;
		System.out.println(res+" is greater");
	}

}
