package Level1;

import java.util.Arrays;
import java.util.Comparator;

public class String_sort {
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		String[] strings1 = {"aazcdaaaaa","aazab","aazfg","abcaa","aazbb","aazaa"};
		
		String[] ans = solution(strings, 1);
		String[] ans1 = solution(strings1, 2);
		
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(ans1));
	}

	private static String[] solution(String[] strings, int n) {
		Arrays.sort(strings); //사전 우선 정렬
//		Arrays.sort(strings, new Comparator<String>() { //n번째의 값을 비교해서 다시 정렬
//			public int compare(String o1, String o2) {
//				if(o1.charAt(n) == o2.charAt(n)) return o1.charAt(n)>=o2.charAt(n)? 0: -1;
//				return o1.charAt(n) - o2.charAt(n);
//			}	
//		});
		Arrays.sort(strings, (o1, o2) -> {
				if(o1.charAt(n) == o2.charAt(n)) return o1.charAt(n)>=o2.charAt(n)? 0: -1;
				return o1.charAt(n) - o2.charAt(n);
		});
		return strings;
	}
}
