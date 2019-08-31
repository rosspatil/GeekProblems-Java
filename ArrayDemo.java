import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class ArrayDemo {

	public static void main(String[] args) {
		int []arr={1,2,3,4,1,2,3,4,5};
		Set<Integer>set=new HashSet<>();
		for(int i:arr)
		{

		}
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
			{
				continue;
			}
			int temp=0;
			set.add(arr[i]);
			for(int  j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					temp++;
				}
			}
			System.out.println(arr[i]+"occured"+temp+"times");

		}
		System.out.println(set);
	}
}
