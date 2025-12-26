import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator c1 = new Calculator();
		System.out.println("Enter number for addition:");
		int a1 = scan.nextInt();
		int b1 = scan.nextInt();
		
		int addResult = c1.add(a1, b1);
		System.out.println("Addition Result is " + addResult);
		
		System.out.println("Enter number for Subtraction");
		int a2 = scan.nextInt();
		int b2 = scan.nextInt();
		int subResult = c1.sub(a2, b2);
		System.out.println("Subtraction result is " + subResult);
		
		System.out.println("Enter number for Multiplication: ");
		int a3 = scan.nextInt();
		int b3 = scan.nextInt();
		int multiplyResult = c1.multiply(a3, b3);
		System.out.println("Multiplication result is " + multiplyResult);
		
		System.out.println("Enter number for division: ");
		int a4 = scan.nextInt();
		int b4 = scan.nextInt();
		double divResult = c1.div(a4, b4);
		System.out.println(divResult);
		
		scan.close();
	}

}
