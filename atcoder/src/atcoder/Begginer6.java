package atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Begginer6 {

	public static void main(String[] args) {
		// 1 以上  N 以下の整数のうち 10 進法での各桁の和が
		// A 以上 B 以下であるものの総和を求めてください。
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = scn.nextInt();
		int b = scn.nextInt();
		int result = 0;
		for (int i = 1; i <= n; i++) {
			int sum = sumDigits(toReverseOrderArray(i), a, b);
			if (sum >= a && sum <= b) {
				result += i;
			}
		}
		System.out.println(result);

	}

	static List<Integer> toReverseOrderArray(int i) {
		List<Integer> list = new ArrayList<>();
		while (i != 0) {
			list.add(i % 10);
			i /= 10;
		}
		return list;
	}

	static int sumDigits(List<Integer> list, int a, int b) {
		int size = list.size();
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += list.get(i);
		}
		return sum;
	}

}
