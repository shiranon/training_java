package atcoder;

import java.util.Scanner;

public class Begginer4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] numberArray;
		int n = scn.nextInt();
		numberArray = new int[n];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = scn.nextInt();
		}
		boolean isEven = true;
		int count = 0;
		while (isEven) {
			for (int i = 0; i < numberArray.length; i++) {
				if (numberArray[i] % 2 != 0) {
					isEven = false;
				} else {
					numberArray[i] /= 2;
				}
			}
			count++;
		}
		System.out.println(count - 1);
		scn.close();
	}
}
