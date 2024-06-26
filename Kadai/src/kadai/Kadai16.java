package kadai;

import java.util.Arrays;
import java.util.Scanner;

public class Kadai16 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// TODO 自動生成されたメソッド・スタブ
		// 10個の数値を入力し、一行に空白で区切り表示させたあと、ローテーションをするプログラム。
		// "L”と入力されたら左に、”R”と入力されたら右に、ローテーションする数を入力させてローテーションした結果を表示する。
		// 　例
		// 　R 方向へ 3つローテーションした数字は　7 8 9 0 1 2 3 4 5 6
		// 　L 方向へ 3つローテーションした数字は　3 4 5 6 7 8 9 0 1 2

		System.out.println("入力された10個の数値を一行に空白で区切り表示させたあと");
		System.out.println("\"L\"と入力されたら左に、\"R\"と入力されたら右に");
		System.out.println("入力された数値分ローテーションします");

		int[] numberArray = new int[10];
		System.out.println();

		System.out.println("数値を" + numberArray.length + "個入力してください");
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = inputInt(i + 1);
		}

		// 入力された値を初期値として保持
		int[] initialArray = Arrays.copyOf(numberArray, numberArray.length);

		System.out.print("入力された数字は　");
		printIntArray(numberArray);

		System.out.println();

		System.out.println("ローテーションさせたい方向を入力してください");
		System.out.println("左は\"L\"を、右は\"R\"を一文字で");

		boolean isLeft = rotateDirection();

		System.out.print(isLeft ? "L" : "R");
		System.out.println("方向に" + "ローテーションしたい数を入力してください");
		int rotationNumber = inputInt();

		//開始タイムスタンプを取得
		long startTime = System.nanoTime();

		//スワップで順番の入れ替えをする
		for (int i = 0; i < rotationNumber % numberArray.length; i++) {
			numberArray = rotationArray(numberArray, isLeft);
		}
		// 終了タイムスタンプを取得
		long endTime = System.nanoTime();
		long result = endTime - startTime;

		System.out.println();
		System.out.println("==forループで一つずつローテーションする方法==");
		System.out.print(isLeft ? "L" : "R");
		System.out.print("方向に" + rotationNumber + "つローテーションした数字は　");
		printIntArray(numberArray);
		System.out.println("ローテーションに" + result + "ナノ秒かかりました");

		System.out.println();

		numberArray = Arrays.copyOf(initialArray, initialArray.length);

		startTime = System.nanoTime();
		// ローテーションさせた数を新しい配列に代入して返す方法
		numberArray = rotationArray(numberArray, rotationNumber, isLeft);
		endTime = System.nanoTime();
		result = endTime - startTime;

		System.out.println("==新しい配列にローテーションさせた値を代入する方法==");
		System.out.print(isLeft ? "L" : "R");
		System.out.print("方向に" + rotationNumber + "つローテーションした数字は　");
		printIntArray(numberArray);
		System.out.println("ローテーションに" + result + "ナノ秒かかりました");

		// scannerを閉じて終了する
		scanner.close();
		System.out.println("==終了==");
	}

	/**
	 * 受け取ったint配列を空白を入れて出力します
	 * @param numberArray
	 */
	static void printIntArray(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			if (i == numberArray.length - 1) {
				System.out.print(numberArray[i]);
			} else {
				System.out.print(numberArray[i] + " ");
			}
		}
		System.out.println();
	}

	/**
	 * 配列を右か左どちらかに1回ローテーションするメソッド
	 * @param numberArray ローテーションする対象の配列
	 * @param isLeft ローテーションする方向
	 * @return ローテーションした配列
	 */
	static int[] rotationArray(int[] numberArray, boolean isLeft) {
		if (isLeft) {
			for (int i = 1; i < numberArray.length; i++) {
				int temp = numberArray[i - 1];
				numberArray[i - 1] = numberArray[i];
				numberArray[i] = temp;

			}
		} else {
			for (int i = numberArray.length - 1; i > 0; i--) {
				int temp = numberArray[i - 1];
				numberArray[i - 1] = numberArray[i];
				numberArray[i] = temp;

			}
		}
		return numberArray;
	}

	/**
	 * 配列を右か左どちらかに指定回数ローテーションするメソッド
	 * @param numberArray
	 * @param rotationNumber
	 * @param isLeft
	 * @return
	 */
	static int[] rotationArray(int[] numberArray, int rotationNumber, boolean isLeft) {
		int[] resultArray = new int[numberArray.length];
		int length = numberArray.length;
		if (isLeft) {
			for (int i = 0; i < length; i++) {
				// 返す配列の0番から順に受けた配列のnumberArray番から代入していく
				// 配列長を超えたら受けた配列の0番からnumberArrayまで
				resultArray[i] = numberArray[(i + rotationNumber) % length];
			}
		} else {
			for (int i = 0; i < length; i++) {
				// 返す配列のnumberArray番から受けた配列の0番から代入していく
				// 配列長を超えたら返す配列の0番からnumberArrayまで
				int index = (i - rotationNumber + length) % length;

				// 配列範囲を超えないようにする
				if (index >= 0) {
					resultArray[i] = numberArray[index];
				} else {
					resultArray[i] = numberArray[length + index];
				}

			}
		}
		return resultArray;
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
	 * int型範囲内の整数値の入力を求めるメソッド
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
	* ローテーションさせたい方向の入力を求めるメソッド
	* Rと入力された場合はfalseを、Lが入力された場合はtrueを返す
	* @return boolean
	*/
	static boolean rotateDirection() {
		scanner = new Scanner(System.in);
		while (true) {
			try {
				if (scanner.hasNext()) {
					String input = scanner.next();
					if (input.equals("R")) {
						return false;
					} else if (input.equals("L")) {
						return true;
					} else {
						System.out.println("\"R\"もしくは\"L\"一文字で入力してください");
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
