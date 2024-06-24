package kadai;

public class Kadai10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 次の図形を表示する。

		// ＊＋＋＋＋＋＋＋＋＋
		// －＊＋＋＋＋＋＋＋＋
		// －－＊＋＋＋＋＋＋＋
		// －－－＊＋＋＋＋＋＋
		// －－－－＊＋＋＋＋＋
		// －－－－－＊＋＋＋＋
		// －－－－－－＊＋＋＋
		// －－－－－－－＊＋＋
		// －－－－－－－－＊＋
		// －－－－－－－－－＊

		int num = 9;
		for (int x = 0; x <= num; x++) {
			for (int y = 0; y <= num; y++) {
				if (x == y) {
					System.out.print("＊");
				} else if (x > y) {
					System.out.print("＋");
				} else {
					System.out.print("－");
				}
			}
			System.out.println();
		}
	}

}
