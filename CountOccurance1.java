import java.util.HashMap;

public class CountOccurance1 {
	public static void main(String[] args) {

		int[] array=new  int[]{10,10,20,30,20,30};
		HashMap<Integer, Integer> map=new HashMap<>();
		for (int i : array) {
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}else{
				map.put(i, 1);
			}
		}		
		System.out.println(map);
	}
}
