package kadai;

public class Kadai04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 負の数値が入力されるまで数値を読み込みその平均を求める。

		System.out.println("【課題04】負の数値が入力されるまで数値を読み込み、その平均を表示します");
		System.out.println("数値を入力してください");
		double sum = 0;
		int cnt = 0;

		double input = inputDouble(cnt + 1);
		while (input >= 0) {
			sum += input;
			cnt++;
			input = inputDouble(cnt + 1);
		}
		if (cnt == 0) {
			System.out.println("入力されませんでした");
		} else {
			System.out.println("入力の合計は" + sum + "で、入力回数は" + cnt);
			System.out.println("平均は" + sum / cnt + "です");
		}
		System.out.println("==終了しました==");
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
				System.out.println(cnt + "回目の数値を入力して下さい");
				return new java.util.Scanner(System.in).nextDouble();
			} catch (Exception e) {
				System.out.println("数値以外が入力されました");
				System.out.println("再入力してください");
			}
		}

	}

}
