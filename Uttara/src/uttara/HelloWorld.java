package uttara;

public class HelloWorld {

	 static public final void main(String[] args) {
		System.out.println("Hello World ! ");

		 int year = 2021;
		 
		 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))


	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	   

	}

}
