package kadai;

public class Kadai05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//数値を10個入力し、3の倍数以外の和を求めて表示する。
		System.out.println("【課題05】数値を10個入力し、3の倍数以外の和を表示します");
		System.out.println("整数値を入力してください");
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int num = inputInt(i + 1);
			if (num % 3 != 0) {
				sum += num;
			}

		}
		System.out.println("入力された3の倍数以外の合計は" + sum + "です");
		System.out.println("==終了しました==");
	}

	/**
	 * 整数の入力を求めるメソッド
	 * 入力時には入力回数(cnt)を表示する
	 * @param cnt 入力回数
	 * @return int 入力された整数値
	 */
	static int inputInt(int cnt) {
		while (true) {
			try {
				System.out.println(cnt + "回目の数値を入力して下さい");
				return new java.util.Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("整数値以外が入力されました");
				System.out.println("再入力してください");
			}
		}

	}
}
