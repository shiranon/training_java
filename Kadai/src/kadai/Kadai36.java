package kadai;

abstract class Staff {
	String name;
	String furigana;

	Staff(String vName, String vFurigana) {
		this.name = vName;
		this.furigana = vFurigana;
	}

	public String getKashiramoji() {
		return this.furigana.substring(0, 1);
	}

	public abstract int getWorkingDay();
}

class FullTimeStaff extends Staff {
	FullTimeStaff(String vName, String vFurigana) {
		super(vName, vFurigana);
	}

	public int getWorkingDay() {
		return 5;
	}
}

class PartTimeStaff extends Staff {
	int workingDay;

	PartTimeStaff(String vName, String vFurigana, int vWorkingDay) {
		super(vName, vFurigana);
		this.workingDay = vWorkingDay;
	}

	public int getWorkingDay() {
		return this.workingDay;
	}
}

public class Kadai36 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FullTimeStaff stuff1 = new FullTimeStaff("山田 太郎", "ヤマダ タロウ");
		PartTimeStaff stuff2 = new PartTimeStaff("鈴木 次郎", "スズキ ジロウ", 2);
		System.out.println("stuff1--------------");
		System.out.println("頭文字			:" + stuff1.getKashiramoji());
		System.out.println("週の出勤日数	:" + stuff1.getWorkingDay());
		System.out.println("stuff2--------------");
		System.out.println("頭文字			:" + stuff2.getKashiramoji());
		System.out.println("週の出勤日数	:" + stuff2.getWorkingDay());
	}
}
