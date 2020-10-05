package Level1;
//https://programmers.co.kr/learn/courses/30/lessons/12932

import java.util.ArrayList;
import java.util.Arrays;

public class Natural_Number_Reverse {
	public static void main(String[] args) {
		long n = 12345;
		int[] ans = solution(n);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] solution(long n) {
        ArrayList<Integer> ans = new ArrayList<>();
        while(n != 0) {
        	ans.add((int)(n%10));
        	n /= 10;
        }
        return ans.stream().mapToInt(i -> i).toArray();
	}
}
