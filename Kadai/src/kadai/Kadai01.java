package kadai;

public class Kadai01 {

	public static void main(String[] args) {
		// TODO 自動作成されたメソッド・スタブ	

		// 変数numの値によって表示結果が以下のように変わるプログラムを作る
		// numが0の時「数値は0です」
		// numが負の値の時「数値は負の値です」
		// numが正の値の時「数値は正の値です」

		System.out.println("【課題01】入力された数値の正負を判断します");
		System.out.println("整数値を入力してください");

		try {
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == 0) {
				System.out.println("数値は0です");
			} else if (num < 0) {
				System.out.println("数値は負の値です");
			} else {
				System.out.println("数値は正の値です");
			}
		} catch (Exception e) {
			System.out.println("整数値以外が入力されたので終了します");
		}
		System.out.println("==終了しました==");
	}

}
