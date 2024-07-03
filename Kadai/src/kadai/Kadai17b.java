package kadai;

import java.util.Scanner;

public class Kadai17b {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 20個の数値を入力をさせ、それを一行に表示。
		// その後、検索値を入力させると、最初に入力した一行に表示した数字と一致したら、何番目と一致したかを表示。
		// 一致しなかった場合は、最後に追加して再度一行を表示する。

		int SIZE = 20;

		int[] numberArray = new int[SIZE];

		System.out.println(SIZE + "個数値を入力後、一行に表示します");
		System.out.println("その後、入力した値が何番目にあるか検索する事ができます");

		System.out.println();

		System.out.println("数値を" + SIZE + "個入力してください");
		for (int i = 0; i < SIZE; i++) {
			numberArray[i] = inputInt(i + 1);
		}

		System.out.println();

		printIntArray(numberArray, "");
		System.out.println();

		System.out.println("検索したい値を入力してください");
		int searchNumber = inputInt();

		printNumberIndex(numberArray, searchNumber);

		System.out.println();
		System.out.println("==終了==");
		scanner.close();
	}

	/**
	 * 配列中に一致する数値があればそれを出力し、一致したかしていないかを返す
	 * @param intArray
	 * @param searchNumber
	 * @return isMatched
	 */
	static void printNumberIndex(int[] intArray, int searchNumber) {
		boolean isMatched = false;
		int length = intArray.length;
		System.out.print(searchNumber + "は");
		for (int i = 0; i < length; i++) {
			if (intArray[i] == searchNumber) {
				System.out.print((i + 1) + "番目 ");
				isMatched = true;
			}
		}
		if (isMatched) {
			System.out.println("と一致しました");
		} else {
			System.out.println("一致する数値がありませんでした");
			System.out.println("末尾に値を追加します\n");
			printIntArray(intArray, "");
			System.out.print(" " + searchNumber);
		}
	}


	/**
	 * 受け取ったintArrayを受け取った文字列と空白を入れて出力します
	 * @param intArray
	 * @param str
	 */
	static void printIntArray(int[] intArray, String str) {
		int length = intArray.length;
		for (int i = 0; i < length; i++) {
			System.out.print(intArray[i] + str);
			if (i < length - 1) {
				System.out.print(" ");
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

	/**
	 * 整数値の入力を求めるメソッド
	 * 受けた数字を入力された回数として表示します
	 * @param cnt
	 * @return
	 */
	static int inputInt(int cnt) {
		scanner = new Scanner(System.in);
		int num = 0;
		while (true) {
			try {
				System.out.println(cnt + "回目の入力です");
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
					System.out.println("不正な値が入力されました");
					System.out.println("再入力してください");
				}
			} catch (Exception e) {
				System.out.println("エラーが発生しました");
			}
		}
		return num;
	}
}
