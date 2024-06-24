package kadai;

public class Kadai07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 2つの整数の値の差を以下のように表示する。
		//「aとbの差は　　です。」
		System.out.println("2つの整数a,bの差を表示します");
		System.out.println("数値を入力してください");
		boolean isFirst = true; // 最初の入力フラグを設定

		int numA = inputInt(isFirst);
		isFirst = false;
		int numB = inputInt(isFirst);

		System.out.println("aとbの差は" + difference(numA, numB) + "です。");

	}

	/**
	 * 数字2つの差を返す
	 * @param numA
	 * @param numB
	 * @return int 差
	 */
	static int difference(int numA, int numB) {
		if (numA > numB) {
			return numA - numB;
		} else {
			return numB - numA;
		}
	}

	/**
	 * 整数の入力を求めるメソッド
	 * 入力時には一つ目の数字aの入力か2つ目の数字bの入力かを表示する
	 * @param isFirst 初回入力か否か
	 * @return int 入力された整数値
	 */
	static int inputInt(boolean isFirst) {
		while (true) {
			try {
				System.out.print(isFirst ? "a" : "b");
				System.out.println("の数値を入力して下さい");
				return new java.util.Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("整数値以外が入力されました");
				System.out.println("再入力してください");
			}
		}

	}
}
