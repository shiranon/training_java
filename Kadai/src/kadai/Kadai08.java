package kadai;

public class Kadai08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 入力された９つの数字を3×3で表示する。
		// 例
		// 1　2　3
		// 4　5　6
		// 7　8　9

		System.out.println("入力された9つの数字を3×3で表示します");
		System.out.println("数字を入力してください");

		double[] doubleArray = new double[9];

		for (int i = 0; i < doubleArray.length; i++) {
			doubleArray[i] = inputDouble(i + 1);
		}

		System.out.println();
		System.out.println("==forを使った場合==");
		for (int i = 0; i < doubleArray.length; i++) {
			//行末にスペースを入れない
			if ((i + 1) % 3 == 0) {
				System.out.print(doubleArray[i]);
				System.out.println();
			} else {
				System.out.print(doubleArray[i] + "　");
			}
		}

		System.out.println();
		System.out.println("==for拡張を使った場合==");
		// クラスが肥大化する場合は雑な変数の宣言は良くない
		int cnt = 1;
		for (double number : doubleArray) {
			if (cnt % 3 == 0) {
				System.out.print(number);
				System.out.println();
			} else {
				System.out.print(number + "　");
			}
			cnt++;
		}
		System.out.println();
		System.out.println("==終了==");

	}

	/**
	 * 浮動小数点数の入力を求めるメソッド
	 * 入力時には入力回数(cnt)を表示する
	 * @param cnt 入力回数
	 * @return double 入力された数値
	 */
	static double inputDouble(int cnt) {
		while (true) {
			try {
				System.out.println(cnt + "回目の入力です");
				return new java.util.Scanner(System.in).nextDouble();

			} catch (Exception e) {
				System.out.println("数字以外が入力されました");
				System.out.println("再入力してください");
			}

		}

	}

}
