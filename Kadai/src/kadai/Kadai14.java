package kadai;

public class Kadai14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 年号の変換プログラム。
		// 西暦年（1868年以降）をキーボードから入力し、
		// 和暦（明治、大正、昭和、平成、令和）に変換するプログラムを作成せよ。
		// 1867年以前の値を入力したばあいは、エラーを表示してプログラムを終了させる。

		System.out.println("西暦年(1868年以降)を和暦に変換します");
		System.out.println("数字4桁で入力してください");
		convertToJapaneseEra(inputInt());

	}

	private enum JapaneseEra {

		MEIJI(1868, "明治"), TAISYO(1912, "大正"), SYOWA(1926, "昭和"), HEISEI(1989, "平成"), REIWA(2019, "令和");

		private final int startYear;
		private final String name;

		JapaneseEra(int startYear, String name) {
			this.startYear = startYear;
			this.name = name;
		}

		public int getStartYear() {
			return startYear;
		}

		public String getName() {
			return name;
		}
	}

	/**
	 * 西暦を和暦に変換して表示するメソッド
	 * JapaneseEraクラス
	 * @param year 西暦
	 */
	static void convertToJapaneseEra(int year) {
		JapaneseEra[] eras = JapaneseEra.values();
		if (year < eras[0].getStartYear()) {
			System.out.println("対応していない年数です");
			return;
		}
		for (int i = 0; i < eras.length; i++) {
			JapaneseEra era = eras[i];
			// 配列長を超えないように最新年号を最初の条件にする
			if (i == eras.length - 1) {
				formatJapaneseEra(year, era, eras[i - 1]);
				break;
			// 最初の年号には前年号の年数を含めない
			} else if (i == 0 && year < eras[i + 1].getStartYear()) {
				formatJapaneseEra(year, era);
				break;
			} else if(year < eras[i + 1].getStartYear()){
				formatJapaneseEra(year, era, eras[i - 1]);
				break;
			}
		}
	}

	/**
	 * 西暦とJapaneseEraインスタンスを受け取り、フォーマットして出力する
	 * @param year 西暦
	 * @param era 対応するJapaneseEraインスタンス
	 */
	static void formatJapaneseEra(int year, JapaneseEra era) {
		int eraYear = year - era.getStartYear() + 1;
		System.out.println(eraYear == 1
			? era.getName() + "元年"
			: era.getName() + eraYear + "年");
	}

	/**
	 * 西暦とJapaneseEraインスタンスを受け取り、フォーマットして出力する
	 * @param year 西暦
	 * @param era 対応するJapaneseEraインスタンス
	 * @param beforeEra 前年号のJapaneseEraインスタンス
	 */
	static void formatJapaneseEra(int year, JapaneseEra era, JapaneseEra beforeEra) {
		int eraYear = year - era.getStartYear() + 1;
		int eraEndYear = year - beforeEra.getStartYear() + 1;
		System.out.println(eraYear == 1
			? era.getName() + "元年（" + beforeEra.getName() + eraEndYear + "年）"
			: era.getName() + eraYear + "年");
	}

	/**
	 * 整数値の入力を求めるメソッド
	 * @return 入力された数値
	 */
	static int inputInt() {
		while (true) {
			try {
				return new java.util.Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("整数値以外が入力されました");
				System.out.println("再入力してください");
			}
		}
	}
}
