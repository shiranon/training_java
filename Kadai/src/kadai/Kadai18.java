package kadai;

import java.util.Scanner;

public class Kadai18 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 10個の数値を入力させ、最大値と最小値は取り除いた、平均値を表示する。
		// ただし、最大値と最小値は複数存在しうるものとする。

		int SIZE = 10;
		double[] numberArray = new double[SIZE];
		System.out.println(SIZE + "個の数字の入力後、最大値と最小値を取り除いた平均値を表示します");

		for (int i = 0; i < SIZE; i++) {
			numberArray[i] = inputDouble(i + 1);
		}
		System.out.println("入力された数値一覧");
		printDoubleArray(numberArray);

		double max = getMaxValueFromArray(numberArray);
		double min = getMinimumValueFromArray(numberArray);
		double sum = sumExcludingMinMax(numberArray, max, min);
		int count = countElementsExcludingMinMax(numberArray, max, min);

		if (min == max) {
			System.out.println("入力された数値が全て同値" + max + "です");
		} else if (count == 0) {
			System.out.println("最大値" + max + "、最小値" + min + "を除いた数がありません");
		} else if (count == 1) {
			System.out.println("最大、最小値を除いた数が" + sum + "の一つです");
		} else {
			System.out.println("入力された数の最大値は " + max + "です");
			System.out.println("入力された数の最小値は " + min + "です");
			System.out.println("入力された数の最大値と最小値は取り除いた平均は " + (sum / count) + "です");
		}
		scanner.close();
		System.out.println("==終了==");

	}

	/**
	 * 配列内の最大値と最小値を除いた要素の数を返す
	 * @param numberArray 対象の配列 max 配列の最大値 min 配列の最小値
	 * @return 最大値と最小値を除いた要素の数
	 */
	static int countElementsExcludingMinMax(double[] numberArray, double max, double min) {
		int count = 0;

		for (double num : numberArray) {
			if (num != max && num != min) {
				count++;
			}
		}
		return count;
	}

	/**
	 * 配列内の最大値と最小値を除いた要素の合計を返す
	 * @param numberArray 対象の配列 max 配列の最大値 min 配列の最小値
	 * @return double 配列内の最大値と最小値を除いた合計
	 */
	static double sumExcludingMinMax(double[] numberArray, double max, double min) {
		double sum = 0;

		for (double num : numberArray) {
			if (num != max && num != min) {
				sum += num;
			}
		}
		return sum;
	}

	/**
	 * 配列内の最大値を返すメソッド
	 * @param numberArray
	 * @return 最大値
	 */
	static double getMaxValueFromArray(double[] numberArray) {
		double max = numberArray[0];
		int length = numberArray.length;
		for (int i = 1; i < length; i++) {
			if (numberArray[i] > max) {
				max = numberArray[i];
			}
		}
		return max;
	}

	/**
	 * 配列内の最小値を返すメソッド
	 * @param numberArray
	 * @return 最小値
	 */
	static double getMinimumValueFromArray(double[] numberArray) {
		double min = numberArray[0];
		int length = numberArray.length;
		for (int i = 1; i < length; i++) {
			if (numberArray[i] < min) {
				min = numberArray[i];
			}
		}
		return min;
	}

	/**
	 * 受け取ったdouble配列を空白を入れて出力します
	 * @param numberArray
	 */
	static void printDoubleArray(double[] numberArray) {
		int length = numberArray.length;
		for (int i = 0; i < length; i++) {
				System.out.print(numberArray[i] + " ");
			if(i< length -1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	/**
	 * 浮動小数点の入力を求めるメソッド
	 * 受けた数字を入力された回数として表示します
	 * @param cnt
	 * @return
	 */
	static double inputDouble(int cnt) {
		scanner = new Scanner(System.in);
		double num = 0;
		while (true) {
			try {
				System.out.println(cnt + "回目の入力です");
				if (scanner.hasNextDouble()) {
					num = scanner.nextDouble();
					break;

				} else {
					scanner.next();
					System.out.println("数値以外が入力されました");
					System.out.println("再入力してください");
				}
			} catch (Exception e) {
				System.out.println("エラーが発生しました");
			}
		}
		return num;
	}

}
