import java.util.HashSet;
import java.util.Set;

public class StringCombination {
	
	public static void main(String[] args) {
		System.out.println("Combination for ROSHAN: "+permutationFinder("VRUSHAL"));
	}
	
	static Set<String> permutationFinder(String str){
		Set<String> perm=new HashSet<>();
		if(str==null){
			return null;
		}else if(str.length()==0){
			perm.add("");
			return perm;
		}
		char init=str.charAt(0);
		String rem=str.substring(1);
		Set<String> words=permutationFinder(rem);
		for (String string : words) {
			for (int i = 0; i <= string.length(); i++) {
				perm.add(setChar(string,init,i));
			}
		}
		return perm;
	}
	
	static String setChar(String str,char init,int i){
		String beg=str.substring(0,i);
		String end=str.substring(i);
		return beg+init+end;
	}

}
