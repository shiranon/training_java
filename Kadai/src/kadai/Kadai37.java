package kadai;

import java.util.ArrayList;
import java.util.Scanner;

public class Kadai37 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<FullTimeStaff> al_f = new ArrayList<FullTimeStaff>();
		ArrayList<PartTimeStaff> al_p = new ArrayList<PartTimeStaff>();
		int status = inputStatus();
		while (status != 2) {
			if (status == 0) {
				al_f.add(inputStaffData());
			} else {
				al_p.add(inputPartStaffData());
			}
			status = inputStatus();
		}
		if (al_f.size() > 0) {
			System.out.println("フルタイム--------------");
			for (FullTimeStaff f : al_f) {
				System.out.println("頭文字:" + f.getKashiramoji() + "　出勤日数:" + f.getWorkingDay());
			}
		}
		if (al_p.size() > 0) {
			System.out.println("パートタイム--------------");
			for (PartTimeStaff p : al_p) {
				System.out.println("頭文字:" + p.getKashiramoji() + "　出勤日数:" + p.getWorkingDay());
			}
		}

		System.out.println("==終了==");
		scanner.close();
	}

	static FullTimeStaff inputStaffData() {
		String name = inputString("名前を入力してください:");
		String furigana = inputFurigana("フリガナを入力してください:");
		return new FullTimeStaff(name, furigana);
	}

	static PartTimeStaff inputPartStaffData() {
		String name = inputString("名前を入力してください:");
		String furigana = inputFurigana("フリガナを入力してください:");
		int workingDay = inputWorkingDay();
		return new PartTimeStaff(name, furigana, workingDay);
	}

	static String inputFurigana(String str) {
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(str);
				String input = scanner.next();
				if (input.matches("^[\\p{InKatakana}ー]+$")) {
					return input;
				} else {
					System.out.println("カタカナのみで入力してください");
				}
			} catch (Exception e) {
				System.out.println("エラーが発生しました");
			}
		}
	}

	static String inputString(String str) {
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(str);
				return scanner.next();

			} catch (Exception e) {
				System.out.println("エラーが発生しました");
			}
		}
	}

	static int inputStatus() {
		scanner = new Scanner(System.in);
		int num = 0;
		while (true) {
			try {
				System.out.println("従業員のデータを入力してください");
				System.out.println("入力メンバーの種類(0:フル 1:パート 2:入力終了)");
				if (scanner.hasNextInt()) {
					int intNum = scanner.nextInt();
					if (intNum >= 0 && intNum <= 2) {
						num = intNum;
						break;
					} else {
						System.out.println("0～2で入力してください");
						System.out.println("入力メンバーの種類(0:フル 1:パート 2:入力終了)");
					}
				} else {
					scanner.next();
					System.out.println("不正な値が入力されました");
					System.out.println("再入力してください");
				}
			} catch (Exception e) {
				System.out.println("エラーが発生しました");
			}
		}
		return num;
	}

	static int inputWorkingDay() {
		scanner = new Scanner(System.in);
		int num = 0;
		while (true) {
			try {
				System.out.println("出勤日数を入力してください");
				if (scanner.hasNextInt()) {
					int intNum = scanner.nextInt();
					if (intNum >= 1 && intNum <= 7) {
						num = intNum;
						break;
					} else {
						System.out.println("出勤日数は1～7で入力してください");
					}
				} else {
					scanner.next();
					System.out.println("不正な値が入力されました");
					System.out.println("再入力してください");
				}
			} catch (Exception e) {
				System.out.println("エラーが発生しました");
			}
		}
		return num;
	}
}
