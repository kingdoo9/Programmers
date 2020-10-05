package Level1;

public class Prime_Number {
	public static void main(String[] args) {
		int n = 5;
		int ans = solution(n);
		System.out.println(ans);
	}

	private static int solution(int n) {
		int answer = 1;
		boolean prime;
		for(int i=3; i<=n; i++) {
			prime = true;
			for(int j=2; j*j<=i; j++) { //루트 i까지만 체크한다.
				if(i%j == 0) { 
					prime = false;
					break;
				}
			}
			if(prime) answer++;
		}
		return answer;
	}
}
