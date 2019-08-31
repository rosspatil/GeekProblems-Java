
public class CountOccurance {
	public static void main(String[] args) {
		
		int[] array=new  int[]{10,15,15,15,10,30,20,30,20,30,10,20,30};
		int[] array1=new int[31];
		int[] count=new int[31];
		for (int i = 0; i < array1.length; i++) {
			array1[i]=0;
			count[i]=0;
		}		
//		NumOfOccurance num=new NumOfOccurance();
//		num.count(array,array1,count);
		
		MySingle.noc.count(array, array1, count);
		
		
		for (int i = 0; i < count.length; i++) {
			if(count[i]!=0){
				System.out.println("count of "+i+" is "+count[i]);
			}
		}

		for (int i : count) {
			
		}
	}
}
