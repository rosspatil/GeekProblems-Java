
public class ArrayMerge {
	public static void main(String[] args) {
		int arr1[]={1,1,2,4,10,27,31};
		int arr2[]={1,2,7,9,32,45,50,60,70};
		int totalSize=arr1.length+arr2.length;
		int arr3[]=new int[totalSize];
		for (int i = 0,j=0,k=0; i < arr3.length;i++ ) {
			if(j<arr1.length && k<arr2.length){
				if(arr1[j]==arr2[k]){
					arr3[i]=arr1[j++];
					arr3[++i]=arr2[k++];
				}else if(arr2[k]<arr1[j]){
					arr3[i]=arr2[k++];
				}else if(arr1[j]<arr2[k]){
					arr3[i]=arr1[j++];
				}
			}else {
				if(arr2.length>arr1.length || j>arr2.length){
					arr3[i]=arr2[k++];
				}else {
					arr3[i]=arr1[j++];
				}
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

	}

}
