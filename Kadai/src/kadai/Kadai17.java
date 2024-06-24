package kadai;

import java.util.ArrayList;
import java.util.Scanner;

public class Kadai17 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 20個の数値を入力をさせ、それを一行に表示。
		// その後、検索値を入力させると、最初に入力した一行に表示した数字と一致したら、何番目と一致したかを表示。
		// 一致しなかった場合は、最後に追加して再度一行を表示する。

		int SIZE = 20;
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		System.out.println(SIZE + "個数値を入力後、一行に表示します");
		System.out.println("その後、入力した値が何番目にあるか検索する事ができます");

		System.out.println();

		System.out.println("数値を" + SIZE + "個入力してください");
		for (int i = 0; i < SIZE; i++) {
			intList.add(inputInt(i + 1));
		}
		System.out.println();

		printIntList(intList);
		System.out.println();

		System.out.println("検索したい値を入力してください");
		int searchNumber = inputInt();

		indexList = searchNumberIndex(intList, searchNumber);

		if (indexList.size() == 0) {
			System.out.println("一致する数値がありませんでした");
			System.out.println("末尾に値を追加します\n");
			intList.add(searchNumber);
			printIntList(intList);
			System.out.println();
		} else {
			System.out.print(searchNumber + "は");
			printIntList(indexList, "番目");
			System.out.println("と一致しました");
		}

		System.out.println();
		System.out.println("==終了==");
		scanner.close();
	}

	/**
	 * 
	 * @param intList
	 * @param searchNumber
	 * @return
	 */
	static ArrayList<Integer> searchNumberIndex(ArrayList<Integer> intList, int searchNumber) {
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		int size = intList.size();
		for (int i = 0; i < size; i++) {
			if (intList.get(i) == searchNumber) {
				indexList.add(i + 1);
			}
		}
		return indexList;
	}

	/**
	 * 受け取ったintListを空白を入れて出力します
	 * @param ArrayList<Integer> intList
	 */
	static void printIntList(ArrayList<Integer> intList) {
		for (int i = 0; i < intList.size(); i++) {
			if (i == intList.size() - 1) {
				System.out.print(intList.get(i));
			} else {
				System.out.print(intList.get(i) + " ");
			}
		}
	}

	/**
	 * 受け取ったintListを受け取った文字列と空白を入れて出力します
	 * @param intList
	 * @param str
	 */
	static void printIntList(ArrayList<Integer> intList, String str) {
		for (int i = 0; i < intList.size(); i++) {
			if (i == intList.size() - 1) {
				System.out.print(intList.get(i) + str);
			} else {
				System.out.print(intList.get(i) + str + " ");
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
				if (scanner.hasNextLong()) {
					long longNum = scanner.nextLong();
					if (longNum >= Integer.MIN_VALUE && longNum <= Integer.MAX_VALUE) {
						System.out.println(cnt + "回目の入力です");
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
