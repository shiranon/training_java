package kadai;

public class Kadai06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 10個の数値を入力し、一行に空白で区切り表示させたあと、逆順で同様に表示す

		System.out.println("【課題06】10個の入力された数値を一行に空白で区切り表示させたあと、逆順で同様に表示します");
		System.out.println("整数値を入力してください");
		double[] numberArray = new double[10];

		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = inputDouble(i + 1);
		}

		// 配列の中を正順で表示する
		System.out.println("==正順==");
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i]);
			if (i == numberArray.length - 1) {
				break;
			}
			System.out.print("　");
		}

		System.out.println("");

		// 配列の中を逆順で表示する
		System.out.println("==逆順==");
		for (int i = numberArray.length - 1; i >= 0; i--) {
			System.out.print(numberArray[i]);
			if (i == 0) {
				break;
			}
			System.out.print("　");
		}

		System.out.println("");

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
