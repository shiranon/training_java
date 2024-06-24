package kadai;

public class Kadai03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 数値を10個入力し、その和を求めて表示する。

		System.out.println("【課題03】入力された数値10個の和を表示します");
		System.out.println("整数値を入力してください");
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			try {
				int num = new java.util.Scanner(System.in).nextInt();
				// sum = sum + num;
				sum += num;
				System.out.println((i + 1) + "回目の入力は" + num + "です");
			} catch (Exception e) {
				System.out.println("整数値以外が入力されました");
				System.out.println("再入力してください");
				i--;
			}
		}
		System.out.println("結果は" + sum + "です");
		System.out.println("==終了しました==");
	}
}
