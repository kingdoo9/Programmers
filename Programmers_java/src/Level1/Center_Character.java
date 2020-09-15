package Level1;

public class Center_Character {
	public static void main(String[] args) {
		String s = "abced";
		String s1 = "qwer";
		
		String answer = solution(s);
		String answer1 = solution(s1);
		
		System.out.println(answer);
		System.out.println(answer1);
	}

	private static String solution(String s) {
		String answer = "";
		
		if(s.length() % 2 == 0) {
			answer = s.substring(s.length()/2-1,s.length()/2+1); //s 길이가 짝수일 때
		}else {
			answer = s.substring(s.length()/2,s.length()/2+1); //홀수일 때
		}
		return answer;
	}
}
