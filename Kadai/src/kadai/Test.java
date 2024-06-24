package kadai;

import java.util.Scanner;

public class Test {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int a = 50;
		System.out.println(a % 40);

	}

	/**
	 * 整数値の入力を求めるメソッド
	 * @return 入力された数値
	 */
	static String inputString() {
		while (true) {
			try {
				return new java.util.Scanner(System.in).next();
			} catch (Exception e) {
				System.out.println("整数値以外が入力されました");
				System.out.println("再入力してください");
			}
		}
	}

	/**
	 * int型範囲内の整数値の入力を求めるメソッド
	 * @return 入力された数値
	 */
	static int inputInt() {
		scanner = new Scanner(System.in);
		int num = 0;
		while (true) {
			try {
				if (scanner.hasNextLong()) {
					long longNum = scanner.nextLong();
					if (longNum >= Integer.MIN_VALUE && longNum <= Integer.MAX_VALUE) {
						num = (int) longNum;
						break;
					} else {
						System.out.println("入力された値がintの範囲を超えています");
						System.out.println("再入力してください");
					}
				} else {
					scanner.next();
					System.out.println("整数値以外が入力されました");
					System.out.println("再入力してください");
				}
			} catch (Exception e) {
				System.out.println("エラーが発生しました");
			}
		}
		return num;
	}
}
