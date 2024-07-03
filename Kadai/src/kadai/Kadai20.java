package kadai;

import java.util.Scanner;

public class Kadai20 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// １〜６までの整数を入力して、入力した数の＊印を表示するプログラムをユーザー定義関数を使って作成しなさい。
		// １を入力した時、「＊」を表示
		// ２を入力した時、「＊＊」を表示
		// ３を入力した時、「＊＊＊」を表示
		// ４を入力した時、「＊＊＊＊」を表示
		// ５を入力した時、「＊＊＊＊＊」を表示
		// ６を入力した時、「＊＊＊＊＊＊」を表示
		// １〜６以外の時は、「エラー：１〜６を入力してください」を表示する。

		System.out.println("入力した１〜６までの数の＊印を表示します");
		int number = getUserInputOneToSixInRange();
		for (int i = 0; i < number; i++) {
			System.out.print("＊");
		}

		scanner.close();

		System.out.println("\n==終了==");
	}

	/**
	* 1から6までの整数値で入力を求めるメソッド
	* @return 1～6までの数値
	*/
	static int getUserInputOneToSixInRange() {
		scanner = new Scanner(System.in);
		while (true) {
			try {
				if (scanner.hasNextInt()) {
					int input = scanner.nextInt();
					if (input <= 6 && input >= 1) {
						return input;
					} else {
						System.out.println("エラー：１〜６を入力してください");
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
