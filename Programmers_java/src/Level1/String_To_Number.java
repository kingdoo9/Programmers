package Level1;
//https://programmers.co.kr/learn/courses/30/lessons/12925

public class String_To_Number {
	public static void main(String[] args) {
		String s = "+1234";
		int num = solution(s);
		System.out.println(num);
	}

	private static int solution(String s) {
		return Integer.parseInt(s);
	}
}
