package kadai;

import java.util.Scanner;

public class Kadai19 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 10個の数字を入力させ、入力された順に一行に並べる。
		// その後昇順か降順かを選択入力させて、選択された並べ方の順で数字を並べ替えて一行で表示する。

		int SIZE = 10;
		int[] numberArray = new int[SIZE];
		System.out.println(SIZE + "個の数字の入力後、降順または昇順に並べ替えします");

		for (int i = 0; i < SIZE; i++) {
			numberArray[i] = inputInt(i + 1);
		}
		System.out.println("降順の場合は1を、昇順の場合は2を入力してください");
		boolean isDesk = getUserInputAsBoolean();

		System.out.println((isDesk ? "降順" : "昇順") + "で並べ替えをしました");
		numberArray = bubbleSort(numberArray, isDesk);
		printIntArray(numberArray);

		scanner.close();

		System.out.println("==終了==");
	}

	/**
	 * 受け取ったint配列を空白を入れて出力します
	 * @param numberArray
	 */
	static void printIntArray(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i]);
			if (i < numberArray.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	/**
	 * バブルソートを行うメソッド
	 * @param numberArray ソート対象の配列
	 * @param isDesk trueの場合は降順、falseの場合は昇順でソート
	 * @return ソートされた配列
	 */
	static int[] bubbleSort(int[] numberArray, boolean isDesk) {
		int length = numberArray.length;
		int temp = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (isDesk) {
					if (numberArray[j] < numberArray[j + 1]) {
						temp = numberArray[j];
						numberArray[j] = numberArray[j + 1];
						numberArray[j + 1] = temp;
					}
				} else {
					if (numberArray[j] > numberArray[j + 1]) {
						temp = numberArray[j];
						numberArray[j] = numberArray[j + 1];
						numberArray[j + 1] = temp;
					}
				}
			}
		}
		return numberArray;
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

	/**
	* 1と入力された場合はtrueを2が入力された場合はfalseを返すメソッド
	* @return boolean
	*/
	static boolean getUserInputAsBoolean() {
		scanner = new Scanner(System.in);
		while (true) {
			try {
				if (scanner.hasNextInt()) {
					int input = scanner.nextInt();
					if (input == 1) {
						return true;
					} else if (input == 2) {
						return false;
					} else {
						System.out.println("1もしくは2を入力してください");
					}
				} else {
					scanner.next();
					System.out.println("入力が不正です");
					System.out.println("再入力してください");
				}
			} catch (Exception e) {
				System.out.println("エラーが発生しました");
			}
		}
	}

}
