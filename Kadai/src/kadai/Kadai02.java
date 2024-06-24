package kadai;

public class Kadai02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 変数numの値によって表示結果が以下のように変わるプログラムを作る。
		// numが0の時「数値は0です。」
		// numが奇数の時「数値は奇数です。」
		// numが偶数の時「数値は偶数です。」

		System.out.println("【課題02】入力された数値が偶数か奇数かを判断します");
		System.out.println("整数値を入力してください");

		try {
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == 0) {
				System.out.println("数値は0です。");
			} else if (num % 2 == 0) {
				System.out.println("数値は偶数です。");
			} else {
				System.out.println("数値は奇数です。");
			}
		} catch (Exception e) {
			System.out.println("整数値以外が入力されたので終了します");
		}
		System.out.println("==終了しました==");
	}

}
