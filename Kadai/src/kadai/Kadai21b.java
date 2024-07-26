package kadai;

import java.util.Random;
import java.util.Scanner;

public class Kadai21b {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 1から9までの数字の１つを抜いて表示して、それを見つけさせるゲーム。
		// 表示する数字はシャッフルさせておく。
		// 10回の表示をさせ、かかった時間を表示する。
		// 20秒以下でできた場合「素早いですね」
		// 20より多く、30秒以下の場合「まあまあですね」
		// 30秒より多く、40秒以下の場合「少し鈍いですね」
		// 40秒より長くかかった場合「鈍すぎます」
		// と表示させて終了する。

		int[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] shuffledArray = new int[9];

		System.out.println("数字当てゲーム");
		System.out.println("1から9までの数字から一つが抜けている物をシャッフルして表示するので");
		System.out.println("抜けている数字を入力してください");
		System.out.println("10回正解するまでの秒数を数えます");
		System.out.println("Enterが押されると始まります");

		inputEnter();

		System.out.println("計測開始\n");

		//開始タイムスタンプを取得
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 10; i++) {
			// 配列の要素をシャッフルする
			shuffledArray = shuffleArray(numberArray);

			System.out.println((i + 1) + "回目");
			printIntArray(shuffledArray, numberArray.length - 1);
			System.out.println();
			// 消された末尾の要素の入力を求める
			answerNumber(shuffledArray[numberArray.length - 1]);
			System.out.println();
		}

		// 終了タイムスタンプを取得
		long endTime = System.currentTimeMillis();

		// 秒に変換
		displayRating((int) (endTime - startTime) / 1000);

		scanner.close();
		System.out.println("==終了==");
	}

	/**
	 * 受け取ったint配列を先頭からnum分表示します。
	 * @param numberArray
	 */
	static void printIntArray(int[] numberArray, int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(numberArray[i]);
			if (i < num - 1) {
				System.out.print(" ");
			}
		}
	}

	/**
	 * 配列の要素の順番をシャッフルして返すメソッド
	 * @param numberArray
	 * @return
	 */
	static int[] shuffleArray(int[] numberArray) {
		Random rand = new Random();
		int length = numberArray.length;
		for (int i = length - 1; i > 0; i--) {
			int r = rand.nextInt(9);
			int temp = numberArray[i];
			numberArray[i] = numberArray[r];
			numberArray[r] = temp;
		}
		return numberArray;
	}

	/**
	 * 引数として受けた数値と同じ数字の入力を求めるメソッド
	 * @param num
	 */
	static void answerNumber(int num) {
		System.out.println("抜けている数字を答えてください");
		scanner = new Scanner(System.in);
		while (true) {
			try {
				if (scanner.hasNextInt()) {
					int input = scanner.nextInt();
					if (input == num) {
						System.out.println("正解");
						break;
					} else {
						System.out.println("数字が違います");
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

	/**
	 * かかった秒数に応じて評価を表示します
	 * @param result
	 */
	static void displayRating(int result) {
		System.out.println(result + "秒かかりました");
		if (result <= 20) {
			System.out.println("素早いですね");
		} else if (result <= 30) {
			System.out.println("まあまあですね");
		} else if (result <= 40) {
			System.out.println("少し鈍いですね");
		} else {
			System.out.println("鈍すぎます");
		}
	}

	/**
	*  Enterの入力を求めるメソッド
	*/
	static void inputEnter() {
		scanner = new Scanner(System.in);
		while (true) {
			try {
				if (scanner.hasNextLine()) {
					String input = scanner.nextLine();
					if (input.isEmpty()) {
						break;
					} else {
						System.out.println("Enterを押してください");
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
