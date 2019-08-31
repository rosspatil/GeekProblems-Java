public class StringReverse {
	
	public static void main(String[] args) {
		String str="I love my country";		
		String []str1=str.split(" ");
		String strRev="";
		for (int i = str1.length-1; i >=0; i--) {
			strRev+=str1[i]+" ";
		}
		System.out.println(strRev);
	}

}
