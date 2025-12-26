import java.util.Scanner;

class UserInformationApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter User ID: ");
		byte userID = scan.nextByte();
		
		System.out.println("Enter your Age");
		short Age = scan.nextShort();
		
		System.out.println("Enter your Phone Number");
		int phoneNumber = scan.nextInt();
		
		System.out.println("Enter National ID");
		long nationalID = scan.nextLong();
		
		System.out.println("Enter Your Height");
		float height = scan.nextFloat();
		
		System.out.println("Enter your Weight");
		double weight = scan.nextDouble();
		
		System.out.println("Enter Your Gender");
		char gender = scan.next().charAt(0);
		
		System.out.println("Enter Your Marriage State");
		boolean isMarried = scan.nextBoolean();
		scan.nextLine();
		
		System.out.println("Enter Your Name");
		String name = scan.nextLine();
		System.out.println("User Information: ");
		System.out.println("User ID: " +userID);
		System.out.println("Age: " + Age);
		System.out.println("Phone Number: " +phoneNumber);
		System.out.println("Nation ID: " +nationalID);
		System.out.println("Height: " + height + " Meters");
		System.out.println("Weight: " +weight + " kg");
		System.out.println("Gender: " +gender);
		System.out.println("isMarried: " +isMarried);
		System.out.println("Name: " +name);
		
		
		scan.close();
		
	}
	
}
