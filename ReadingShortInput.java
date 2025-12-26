import java.util.Scanner;
public class ReadingShortInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		short a = scan.nextShort();
		System.out.println(a);
		scan.close();
	}

}
