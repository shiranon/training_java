package kadai;

public class Kadai11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//10個の数値を入力させ、最大値と最小値を表示する。
		//※この課題以降は例外処理（try~chach）を入れること。

		double max = inputDouble(1);
		double min = max;
		for (int i = 1; i < 10; i++) {
			double input = inputDouble(i + 1);
			if (input > max) {
				max = input;
			} else if (input < min) {
				min = input;
			}
		}
		System.out.println("最大値は" + max + "、最小値は" + min + "です");
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
