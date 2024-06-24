package atcoder;

import java.util.Scanner;

public class Begginer3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] strs = new String[3];

		String b = scn.next();

		int count = 0;
		strs = (b.split(""));

		for (String str : strs) {
			if (str.equals("1")) {
				count++;
			}
		}
		System.out.println(count);
		scn.close();

	}
}
