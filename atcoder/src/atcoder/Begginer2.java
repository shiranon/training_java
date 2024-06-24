package atcoder;

import java.util.Scanner;

public class Begginer2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(a * b % 2 == 0 ? "Even" : "Odd");
		scanner.close();
	}

}
