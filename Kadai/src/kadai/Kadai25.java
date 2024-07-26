package kadai;

import java.util.Scanner;

public class Kadai25 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 整数を10回入力させ、一行に表示し、
		// 同じ数字があればその数字が何回出現しているかを表示し、
		// ない場合は重複なし、と表示する。
		int length = 4;
		int[] intArray = new int[length];
		System.out.println("数字を10回入力してください");
		for (int i = 0; i < length; i++) {
			intArray[i] = inputInt(i + 1);
		}
		printIntArray(intArray);

		// 昇順でソートする
		quickSort(intArray, 0, length - 1);
		System.out.println();
		printIntArray(intArray);
		// 一つ目の要素 intArrayのインデックス
		// 二つ目の要素 重複があったか
		int[] countDup = { 0, 0 };
		while (countDup[0] < length - 1) {
			countSameNumber()
		}
	}

	static int countSameNumber(int[] intArray, int[] countDup) {
		// インデックスの要素
		int number = intArray[countDup[0]];
		countDup[1]=0;
		while (true) {
			// 配列長を超える場合は終了
			if (intArray.length - 1 == index) {
				break;
			}
			// 違う要素の値が出たら終了
			if (number != intArray[index + 1]) {
				break;
			}
			index++;
			count++;
		}
		if (count != 0) {
			System.out.println(number + "と同じ数字は" + count + "個ありました");
		}
		return index++;
	}

	/**
	 * int配列のクイックソート
	 * @param a ソートする配列
	 * @param left 先頭インデックス
	 * @param right 末尾インデックス
	 */
	static void quickSort(int[] a, int left, int right) {
		//先頭が末尾以上なら再帰を終了する
		if (left >= right)
			return;

		// 配列の中央要素の値をピボットとする
		int pivot = (int) a[(left + right) / 2];
		// 左右のインデックス
		int l = left;
		int r = right;

		// 左インデックスが右インデックス以下の間ループする
		while (l <= r) {
			// 左側の要素からピボットより大きい値を探す
			while (a[l] < pivot) {
				l++;
			}
			// 左側の要素からピボットより小さい値を探す
			while (a[r] > pivot) {
				r--;
			}
			if (l <= r) {
				// 左右の要素を交換する
				int temp = a[l];
				a[l] = a[r];
				a[r] = temp;
				// 各インデックスを進める
				l++;
				r--;
			}
		}

		quickSort(a, left, r);
		quickSort(a, l, right);
	}

	/**
	 * 受け取ったintArrayを空白を入れて出力します
	 * @param intArray
	 * @param str
	 */
	static void printIntArray(int[] intArray) {
		int length = intArray.length;
		for (int i = 0; i < length; i++) {
			System.out.print(intArray[i]);
			if (i < length - 1) {
				System.out.print(" ");
			}
		}
	}

	/**
	 * 整数値の入力を求めるメソッド
	 * @return
	 */
	static int inputInt(int cnt) {
		while (true) {
			try {
				if (scanner.hasNextInt()) {
					System.out.println(cnt + "回目の入力です");
					return scanner.nextInt();
				} else {
					scanner.next();
					System.out.println("不正な値が入力されました");
					System.out.println("再入力してください");
				}
			} catch (Exception e) {
				System.out.println("エラーが発生しました");
				scanner.nextLine(); // 入力バッファをクリア
			}
		}
	}
}
