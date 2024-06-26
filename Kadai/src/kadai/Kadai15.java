package kadai;

import java.util.Scanner;

public class Kadai15 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 入力された９つの数字を
		// 3×3で表示し、
		// 時計回りに90度回転させ、表示する
		// 例
		// 1　2　3
		// 4　5　6
		// 7　8　9
		// ↓
		// 7　4　1
		// 8　5　2
		// 9　6　3
		System.out.println("入力された９つの数字を3×3で表示した後");
		System.out.println("時計回りに90度回転させ、表示します");

		int[][] numberArray = new int[3][3];
		for (int x = 0; x < numberArray.length; x++) {
			for (int y = 0; y < numberArray[x].length; y++) {
				numberArray[x][y] = inputInt(x + 1);
			}
		}
		System.out.println();

		for (int x = 0; x < numberArray.length; x++) {
			for (int y = 0; y < numberArray[x].length; y++) {
				if (y == numberArray[x].length - 1) {
					System.out.print(numberArray[x][y]);
				} else {
					System.out.print(numberArray[x][y] + "　");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("時計回りに90度");
		for (int y = 0; y < numberArray[0].length; y++) {
			for (int x = numberArray.length - 1; x >= 0; x--) {
				if (x == 0) {
					System.out.print(numberArray[x][y]);
				} else {
					System.out.print(numberArray[x][y] + "　");
				}
			}
			System.out.println();
		}

		scanner.close();
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
