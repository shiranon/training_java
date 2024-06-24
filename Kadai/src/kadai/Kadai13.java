package kadai;

public class Kadai13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// グループ分けの調査。
		// テストの結果により、A,B,C,Dのグループに分けることにする。
		// テストの得点は0〜45点でグループ分けは次のとおりである。
		// A：0〜20
		// B：21〜30
		// C：31〜35
		// D：36〜45
		// n人のテストの得点を入力して、各グループが何名になるか調査するプログラムを作成する。
		// また、入力された点数をわかりやすく表示をし、
		// グループ分けの結果を表示すること。

		System.out.println("成績のグループ分けをします");
		System.out.println("テストを受けた人数を入力してください");
		int numberPeople = inputInt();
		int[] scores = new int[numberPeople];

		System.out.println("点数を入力してください");
		for (int i = 0; i < numberPeople; i++) {
			scores[i] = inputInt(i + 1);
		}
		String[] groupScores = new String[] { "", "", "", "" };
		int groupNumber[] = new int[] { 0, 0, 0, 0 };
		char[] group = new char[] { 'A', 'B', 'C', 'D' };

		for (int score : scores) {
			if (score <= 20) {
				groupNumber[0]++;
				groupScores[0] += score + "点 ";
			} else if (score <= 30) {
				groupNumber[1]++;
				groupScores[1] += score + "点 ";
			} else if (score <= 35) {
				groupNumber[2]++;
				groupScores[2] += score + "点 ";
			} else {
				groupNumber[3]++;
				groupScores[3] += score + "点 ";
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("グループ" + group[i] + "は" + groupNumber[i] + "人");
			if (groupNumber[i] == 0) {
				System.out.println("点数はありません");
			} else {
				System.out.println("点数は" + groupScores[i]);
			}
		}
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

	/**
	 * 0から45までの正の整数の入力を求めるメソッド
	 * 入力回数を受け取り表示する
	 * @param cnt 入力回数
	 * @return 入力された数値
	 */
	static int inputInt(int cnt) {
		while (true) {
			try {
				System.out.println(cnt + "回目の入力です");
				int input = new java.util.Scanner(System.in).nextInt();
				if (input >= 0 && input <= 45) {
					return input;
				} else {
					System.out.println("0から45の間で入力してください");
				}
			} catch (Exception e) {
				System.out.println("正の整数値以外が入力されました");
				System.out.println("再入力してください");
			}
		}
	}
}
