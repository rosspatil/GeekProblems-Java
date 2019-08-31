
public class SecondHighest {
	
	public static void main(String[] args) {
		int arr[]={200,1,5,10,45,12,12,46,47,110,102,502};
		
		int max=0;
		int max1=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max){
				max1=max;
				max=arr[i];
			}else if(arr[i]>max1){
				max1=arr[i];
			}
		}
		System.out.println(max1);
	}

}
