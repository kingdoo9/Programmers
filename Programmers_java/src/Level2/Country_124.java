package Level2;

public class Country_124 {
	public static void main(String[] args) {
		String ans = solution(10);
		System.out.println(ans);
	}

	private static String solution(int n) {
		String[] num = {"4","1","2"};
        String answer = "";
        while(n != 0) {
        	answer = num[n%3] + answer;
        	if(n%3 == 0) n = n/3 -1;
        	else n /= 3;
        }        
        return answer;
	}
}
