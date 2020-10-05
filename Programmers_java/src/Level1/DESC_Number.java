package Level1; //https://programmers.co.kr/learn/courses/30/lessons/12933

import java.util.Arrays;
import java.util.Comparator;

public class DESC_Number {
	public static void main(String[] args) {
		long n = 118372;
		long ans = solution(n);
		System.out.println(ans);
	}

	private static long solution(long n) {
		String[] ans1 = Long.toString(n).split(""); // String �迭�� �� ���ھ� ����
		Arrays.sort(ans1, Comparator.reverseOrder()); // �������� ����
		return Long.parseLong(String.join("", ans1)); // �ٽ� ��ġ�� Long���� �� ��ȯ
	}
}
