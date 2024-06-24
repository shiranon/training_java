package atcoder;

import java.util.Scanner;

public class Begginer5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int x = scn.nextInt();
		int count = 0;
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				for (int k = 0; k <= c; k++) {
					if ((i * 500 + j * 100 + k * 50) == x) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
		scn.close();
	}
}
