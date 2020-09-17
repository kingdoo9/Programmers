package Level1;

public class Number_Of_Y_P {
	public static void main(String[] args) {
		String s = "pPoooyY";
		String s1 = "Pyy";
		
		boolean ans = solution(s);
		boolean ans1 = solution(s1);
	}

	private static boolean solution(String s) {
		boolean answer = true;
		int p_n = 0;
		int y_n = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') y_n++;
			if(s.charAt(i) == 'p' || s.charAt(i) == 'P') p_n++;
		}
		
		if(p_n != y_n) answer = false;
		
		return answer;
	}
}
