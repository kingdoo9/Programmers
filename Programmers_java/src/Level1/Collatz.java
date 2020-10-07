package Level1;//https://programmers.co.kr/learn/courses/30/lessons/12943

public class Collatz {
	public static void main(String[] args) {
		int n = 626331;
		int ans = solution(n);
		System.out.println(ans);
	}

	private static int solution(int num) {
		int ans = -1;
		long n = num;
		
		for(int i=0; i<500; i++) {
			if(n == 1) {
				ans = i;
				break;
			}
			
			if(n%2 == 0) n = n/2;
			else n = (n*3) + 1;
		}
		return ans;
	}
}
