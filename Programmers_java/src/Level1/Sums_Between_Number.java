package Level1;

public class Sums_Between_Number {
	public static void main(String[] args) {
		long ans = solution(3,5);
		long ans1 = solution(3,3);
		long ans2 = solution(5,3);
		
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
	}

	private static long solution(int a, int b) {
		long answer = 0;
		for(int i = Math.min(a, b); i<=Math.max(a, b); i++) answer+=i;
		return answer;
	}
}
