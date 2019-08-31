
public class NumOfOccurance {

	public void count(int[] array,int[] array1,int[] count) {

		for (int i = 0; i < array.length; i++) {
			if(array1[array[i]]==0){
				array1[array[i]]=array[i];
				count[array[i]]++;
			}else{
				count[array[i]]++;
			}
		}
	}



}
