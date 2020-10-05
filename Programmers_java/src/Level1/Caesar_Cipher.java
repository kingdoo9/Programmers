package Level1;
//https://programmers.co.kr/learn/courses/30/lessons/12926
public class Caesar_Cipher {
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		String ans = solution(s, n);
		System.out.println(ans);
	}

	private static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == ' ') answer.append(' ');
        	else if(s.charAt(i) <= 'Z') {
        		System.out.println(s.charAt(i) + n);
        		answer.append((char)((s.charAt(i) + n) > 'Z' ? (s.charAt(i)+n)-26 : s.charAt(i) + n));
        	}else
        		answer.append((char)((s.charAt(i) + n) > 'z' ? (s.charAt(i)+n)-26 : s.charAt(i) + n));
        }
        return answer.toString();
	}
}
