
public class MyDate implements Cloneable {
	private int date,month,year;
	static int cnt;
	public MyDate(){
		cnt++;
		date=06;
		month=06;
		year=2016;
	}

//	static{
//		System.out.println("Static block.....");
//	}
//	
//	{
//		System.out.println("instance block....");
//	}


	public MyDate(int date, int month, int year) {
		this(); //Constructure chaining
		this.date = date;
		this.month = month;
		this.year = year;
	}



	@Override
	public String toString() {
		return date+"/"+month+"/"+year;
	}


	public void printDate(){
		System.out.println(date+"/"+month+"/"+year);
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	
	
//	@Override
//	protected void finalize() throws Throwable {
//		super.finalize();
//		System.out.println("final created");
//	}
}
