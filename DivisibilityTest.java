
public class DivisibilityTest {

	public void check(){
		for (int i = 0; i < 50; i++) {
			
			String str;
			str=(i%3==0 && i%5==0)?i+" is divisible by 3 and 5":(i%3==0)?i+" is ivisible by 3":(i%5==0)?i+"is divisible by  5":null;
			
			message(str);
			
			
			
//			if(i%3==0){
//				if(i%5==0){
//					System.out.println(i+" is divisible by both 3 and 5");
//				}else{
//					System.out.println(i+" is divisible by only 3 ");
//				}
//
//			}else if(i%5==0){
//				if(i%3==0){
//					System.out.println(i+" is divisible by both 3 and 5");
//				}else{
//					System.out.println(i+" is divisible by only 5 ");
//				}
//
//			}
		}
	}
	
	void message(String str){
		if(str!=null)
		 System.out.println(str);
	}

}
