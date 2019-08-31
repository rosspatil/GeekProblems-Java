
public class PythargoranTriplet {
	
	public static void main(String[] args) {
		
		for (int i = 1;i<10000 ; i++) {
			for (int j = i+1;j<10000 ; j++) {
				for (int k = j+1; k<10000; k++) {
					if((i*i)+(j*j)==(k*k)&& (i+j+k)==1000){
						System.out.println(i*j*k);
						return;
					}
				}
				
			}
			
		}
		
	}

}
