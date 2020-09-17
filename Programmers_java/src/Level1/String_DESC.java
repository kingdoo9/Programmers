package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class String_DESC {
	public static void main(String[] args) {
		String S = "ZbcdAefg";
		String ans = solution(S);
		
		System.out.println(ans);
	}

	private static String solution(String s) {
		char[] S = s.toCharArray();
		
		// �ʱ� ��� : �ҹ��ڿ� �빮�ڸ� �и��� �����
//		String ans ="";
//		ArrayList<Character> Lower = new ArrayList<>();
//		ArrayList<Character> Upper = new ArrayList<>();
//		for(int i=0; i<S.length; i++) {
//			if(S[i] >= 'a' && S[i] <='z') Lower.add(S[i]);
//			else Upper.add(S[i]);
//		}
//		Lower.sort(Collections.reverseOrder());
//		Upper.sort(Collections.reverseOrder());
//		Lower.addAll(Upper);
//		for(char c : Lower) ans += c;
//		return ans;
		
		// �ı� ��� : char �迭�� ���� �� ���� ���
		Arrays.sort(S);
		return new StringBuilder(new String(S)).reverse().toString();
	}
}
