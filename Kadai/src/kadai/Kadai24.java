package kadai;

import java.util.Random;
import java.util.Scanner;

public class Kadai24 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 数あてゲーム。0から99までの整数を決めてその数字をあてさせるゲーム。
		// 入力された数字が決めた数より大きいか小さいかを伝え、数を当てさせる。
		// 何回目で当たり、そこにかかった時間を表示する。

		System.out.println("0から99までの整数がランダムで選ばれるので、その数字を当てて下さい");
		System.out.println("入力された数字が違う場合は大きいか小さいかが表示されます");
		System.out.println("何回目で当てられるかと、当てられるまでにかかった時間が計測されます");
		System.out.println("Enterを押してください");
		inputEnter();

		// 0から99までの整数をランダムで生成
		Random rand = new Random();
		int answer = rand.nextInt(100);
		int count = 0;
		boolean isCorrect = false;

		System.out.println("計測開始\n");
		System.out.println("答えを入力してください");
		//開始タイムスタンプを取得
		long startTime = System.currentTimeMillis();

		// 答えと一致したら抜ける
		while (isCorrect == false) {
			count++;
			int input = inputInt();
			isCorrect = compareWithAnswer(input, answer);
		}

		// 終了タイムスタンプを取得
		long endTime = System.currentTimeMillis();

		int second = (int) ((endTime - startTime) / 1000);
		System.out.println("答え:" + answer);
		System.out.println("正解までにかかった回数:" + count);
		System.out.println("正解までにかかった秒数:" + second);

		scanner.close();
		System.out.println("==終了==");
	}

	static boolean compareWithAnswer(int input, int answer) {
		// 早期returnをする
		if (input == answer) {
			System.out.println("正解しました");
			return true;
		}
		if (input > answer) {
			System.out.println(input + "は答えより大きいです");
			System.out.println("再入力してください");
			return false;
		} else {
			System.out.println(input + "は答えより小さいです");
			System.out.println("再入力してください");
			return false;
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

	/**
	 * 整数値の入力を求めるメソッド
	 * @return
	 */
	static int inputInt() {
		while (true) {
			try {
				if (scanner.hasNextInt()) {
					return scanner.nextInt();
				} else {
					scanner.next();
					System.out.println("不正な値が入力されました");
					System.out.println("再入力してください");
				}
			} catch (Exception e) {
				System.out.println("エラーが発生しました");
				scanner.nextLine(); // 入力バッファをクリア
			}
		}
	}
}
