package Level1;

public class Year2016 {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		String answer = solution(a, b);
		System.out.println(answer);
	}

	private static String solution(int a, int b) {
		int[] calendar = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		String answer="";
		int sum=0;
		for(int i=1; i < a; i++) sum+=calendar[i];
		sum += b;
		
		switch(sum%7) {
			case 0:
				answer = "THU";
				break;
			case 1:
				answer = "FRI";
				break;
			case 2:
				answer = "SAT";
				break;
			case 3:
				answer = "SUN";
				break;
			case 4:
				answer = "MON";
				break;
			case 5:
				answer = "TUE";
				break;
			case 6:
				answer = "WED";
				break;
		}
		
		return answer;
	}
}
