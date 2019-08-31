
public class DateValidate {

	public static void valid(int date,int month,int year){
		int[] array1=new int[]{1,3,5,7,8,10,12};
		int[] array2=new int[]{4,6,9,11};

		int flag=0;
		if(month==2){
			if((year%4==0)&& date>=1 && date<=28){
				flag=1;
			}
		}else{

			for (int i = 0; i < array1.length; i++) {
				if(month==array1[i]){
					if(date>=1 && date<=31){
						flag=1;
						break;
					}
				}
			}
			for (int i = 0; i < array2.length; i++) {
				if(month==array1[i]){
					if(date>=1 && date<=30){
						flag=1;
						break;
					}
				}
			}
		}

		if(flag==1){
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}

	}

	public static void main(String[] args) {
		valid(31,12,2016);
	}
}
