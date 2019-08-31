import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateCalculator {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		Date date=new Date("1-DEC-2016");
		Date[] vacations={new Date("14-DEC-2016"),new Date("15-DEC-2016"),new Date("22-DEC-2016")};

		System.out.println("Enter number of Working Days:");
		int n=sc.nextInt();
		int dat=date.getDate();

		//		for (int i = dat; i < (n+dat); i++) {
		//			date.setDate(i);		
		//			for (Date date2 : vacations) {
		//				if((date.getDay()==0 || date.getDay()==6)||date.getDate()==date2.getDate()){
		//					dat++;
		//					System.out.println("Holiday:"+date);
		//					break;
		//				}
		//			}
		//
		//		}
		//		System.out.println("Your last Date of Work:"+date);
		
		for (int i = dat,j=0; i < (n+dat); i++) {
			date.setDate(i);

			if(date.getDay()==0 || date.getDay()==6){
				dat++;
				System.out.println("Holiday:"+date);
			}else if(j<vacations.length && date.getDate()==vacations[j].getDate()){
				dat++;
				j++;
				System.out.println("Holiday:"+date);
			}
		}
		System.out.println("Last Day:"+date);
	}

}
