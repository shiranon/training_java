package kadai;

public class Kadai12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// ゲームの得点を表示する。
		// 獲得した得点に従いボーナス点が付く。得点を入力して、ボーナス点と総得点を求めて表示したい。
		// なお、ボーナス点の小数点以下は切り捨てとする。

		// 得点　　　　　 ボーナス点
		// 0〜499　　　　 20
		// 500〜999　　　 得点の5%
		// 1000〜4999　　 得点の4%
		// 5000以上　　　 得点の3%

		System.out.println("ゲームの得点を入力してください");
		int score = inputInt();
		int bonus = calcBonus(score);
		System.out.println("ボーナス点は" + bonus+"点");
		System.out.println("総得点は" + (score + bonus) + "点です");
	}

	/**
	 * スコアに対応するボーナス点を返します
	 * @param score スコア
	 * @return int ボーナス
	 */
	static int calcBonus(int score) {
		double temp = 0;
		if (score <= 499) {
			return 20;
		} else if (score <= 999) {
			temp = score * 0.05;

		} else if (score <= 4999) {
			temp = score * 0.04;
		} else {
			temp = score * 0.03;
		}
		return (int) temp;
	}

	/**
	 * 正の整数の入力を求めるメソッド
	 * @return 入力された数値
	 */
	static int inputInt() {
		while (true) {
			try {
				int input = new java.util.Scanner(System.in).nextInt();
				if (input >= 0) {
					return input;
				} else {
					System.out.println("正の整数値以外が入力されました");
				}
			} catch (Exception e) {
				System.out.println("正の整数値以外が入力されました");
				System.out.println("再入力してください");
			}
		}
	}
}
