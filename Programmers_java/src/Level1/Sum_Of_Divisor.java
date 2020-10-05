package Level1;
//https://programmers.co.kr/learn/courses/30/lessons/12928

public class Sum_Of_Divisor {
	public static void main(String[] args) {
		int n = 24;
		int ans = solution(n);
		System.out.println(ans);
	}

	private static int solution(int n) {
        if( n <= 1) return n;
        int answer = 0;
        for(int i=1; i*i<=n; i++) {
        	if(n%i == 0) {
                if(i != n/i){
                    answer += i;
                    answer += n/i;
                }else answer += i;
        	}
        }
        return answer;
	}
}
