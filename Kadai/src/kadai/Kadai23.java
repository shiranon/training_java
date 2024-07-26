package kadai;

import java.util.Scanner;

public class Kadai23 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// 10個の整数値を入力させた後、空白で区切り一行表示する。
		// その後、探索データとして整数値を入力させ、一行表示させた10個の整数値と一致する要素を発見した場合、
		// その要素より前の要素を順次一つ後ろに移動させ、発見した要素を先頭に格納して、一行表示をする。

		int LENGTH = 10;

		int[] numberArray = new int[LENGTH];

		System.out.println("整数値" + LENGTH + "個の入力後、一行に表示します");
		System.out.println("その後、入力値と一致する要素があった場合、その要素より前の要素を順次一つ後ろに移動させ、");
		System.out.println("発見した要素を先頭に格納して一行に表示します\n");

		System.out.println("整数値を" + LENGTH + "個入力してください");
		for (int i = 0; i < LENGTH; i++) {
			numberArray[i] = inputInt(i + 1);
		}
		printIntArray(numberArray);

		System.out.println();

		System.out.println("先頭に移動したい数値を入力してください");
		int searchNumber = inputInt();

		pushToFrontArrayNumber(searchNumber, numberArray);

		scanner.close();

		System.out.println("\n==終了==");
	}

	/**
	 * 配列内にある一致する要素を全て、先頭に移動し、それより前の要素は後ろに移動させるメソッド
	 * @param number
	 * @param numberArray
	 */
	static void pushToFrontArrayNumber(int searchNumber, int[] numberArray) {
		boolean isMatched = false;
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] == searchNumber) {
				pushToFront(i, numberArray);
				isMatched = true;
			}
		}
		if (isMatched) {
			System.out.println("\n一致した数値を先頭に移動しました");
			printIntArray(numberArray);
		} else {
			System.out.print("\n一致する数値はありませんでした");
		}
	}

	/**
	 * 受け取ったインデックス番の要素から前の要素を後ろに移動し、
	 * インデックス番の要素を先頭に移動するメソッド
	 * @param index
	 * @param numberArray
	 * @return
	 */
	static int[] pushToFront(int index, int[] numberArray) {
		int temp = numberArray[index];
		for (int i = index; i > 0; i--) {
			numberArray[i] = numberArray[i - 1];
		}
		numberArray[0] = temp;
		return numberArray;
	}

	/**
	 * 受け取ったint配列を空白を入れて出力するメソッド
	 * @param numberArray
	 */
	static void printIntArray(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i]);
			if (i < numberArray.length - 1) {
				System.out.print(" ");
			}
		}
	}

	/**
	 * 整数値の入力を求めるメソッド
	 * @return
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
