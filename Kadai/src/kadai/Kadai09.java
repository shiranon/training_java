package kadai;

public class Kadai09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 1×1=1　1×2=2　・・・・・　1×9=9
		// のように九九の表を1から9の段まで作成する。

		System.out.println("九九の表を表示します");

		int num = 9;
		System.out.println();
		for (int x = 1; x <= num; x++) {
			for (int y = 1; y <= num; y++) {
				String multiplicationResult = x + "×" + y + "=" + x * y;
				if (y == num) {
					System.out.print(multiplicationResult);
					System.out.println();
				} else {
					System.out.print(multiplicationResult + " ");
				}
			}
		}
	}
}
