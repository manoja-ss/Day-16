import java.util.Scanner;
public class RetrievingFirstCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstChar = scan.next();
		char first = firstCharacter(firstChar);
		System.out.println(first);
		scan.close();
	}

	static char firstCharacter(String str1) {
		char ch = str1.charAt(0);
		return ch;
	}
}
