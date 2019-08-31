import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class PairForSum {

	public static void main(String[] args) {


		int arr[]={1,14,7,8,10,5,12,3,2,13,11,4,9,6};
		/*Arrays.sort(arr);

		for(int i=0,j=arr.length-1;i<j;){
			if((arr[i]+arr[j])==15){
				System.out.println("Pair found:"+arr[i]+" and "+arr[j]);
				i++;
				j--;
			}else if((arr[i]+arr[j])<15){
				i++;
			}else{
				j--;
			}
		}*/
		/*HashMap<Integer, Integer> map=new HashMap<>();
		for (int i : arr) {
			map.put(i, 1);
		}
		
		
		for (int i = 1; i <= 15; i++) {
			int j=15-i;
			if(map.containsKey(j) && map.containsKey(i)){
				System.out.println(i +" and "+ j);
			}
		}*/
		
		ArrayList<Integer> arr1=new ArrayList<>();
		for (int i : arr) {
			arr1.add(i);
		}
		
		for (int i = 0; i < arr1.size(); i++) {
			if(arr1.contains(10-i) && arr1.contains(i)){
				System.out.println(10-i+" and "+i);
			}
		}
		

	}

}
