package Level1;
//https://programmers.co.kr/learn/courses/30/lessons/12930

public class Strange_String {
	public static void main(String[] args) {
		String s = "try hello world";
		String ans = solution(s);
		System.out.println(ans);
	}

	private static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int count = 0;
        
        for(char c : s.toCharArray()) {
        	if(c == ' ') {
        		count = 0;
        		answer.append(c);
        	}else if(count%2 == 0) {
        		answer.append(Character.toUpperCase(c));
        		count++;
        	}else {
        		answer.append(Character.toLowerCase(c));
        		count++;
        	}
        }
    
        return answer.toString();
	}
}
