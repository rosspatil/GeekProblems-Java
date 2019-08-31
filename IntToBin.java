
public class IntToBin {

	
	public static void main(String[] args) {
		String bin=Integer.toBinaryString(64);
		System.out.println(bin.length()-1);
		int count=0;
		for(int i=0;i<bin.length();i++){
			if(bin.charAt(i)=='1'){
				count++;
			}
		}
		if(count==1)
		System.out.println(count);
	}
}
