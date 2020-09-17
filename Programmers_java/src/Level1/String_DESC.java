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
		
		// 초기 방법 : 소문자와 대문자를 분리후 재결합
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
		
		// 후기 방법 : char 배열을 정렬 후 역순 출력
		Arrays.sort(S);
		return new StringBuilder(new String(S)).reverse().toString();
	}
}
