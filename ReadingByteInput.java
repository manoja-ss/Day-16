import java.util.Scanner;
public class ReadingByteInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		byte a = scan.nextByte();
		System.out.println(a);
		scan.close();
	}

}
