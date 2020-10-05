package Level1;
//https://programmers.co.kr/learn/courses/30/lessons/12931

public class Add_number {
	public static void main(String[] args) {
		int N = 987;
		int ans = solution(N);
		System.out.println(ans);
	}

	private static int solution(int n) {
		int ans = 0;
		while(n != 0) {
			ans += n%10;
			n /= 10;
		}
		return ans;
	}
}
