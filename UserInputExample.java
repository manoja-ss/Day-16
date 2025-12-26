import java.util.Scanner;

class UserInputExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a Byte Number - Or Rate as for 10: ");
		byte rating = scan.nextByte();
		System.out.println("You Have Rated as: " + rating + "/10 Thankyou");
		
		System.out.print("Enter a Short Number: ");
		short shortNumber = scan.nextShort();
		System.out.println("You Have Entered " + shortNumber + " as the Short Number");
		
		System.out.print("Enter a integer Number: ");
		int intNumber = scan.nextInt();
		System.out.println("You Have Entered The Number as: " + intNumber);
		
		System.out.print("Enter a Long Number: ");
		long longNumber = scan.nextLong();
		System.out.println("You Have Entered Long Number as: " + longNumber);
		
		System.out.print("Enter a Float Number Here: ");
		float floatNumber = scan.nextFloat();
		System.out.println("You Have Entered Float Number as: " + floatNumber);
		
		System.out.print("Enter a Double Number Here: ");
		double doubleNumber = scan.nextDouble();
		System.out.println("Your Double Number is: " + doubleNumber);
		scan.close();
	}

}
