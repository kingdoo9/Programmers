package Level1;//https://programmers.co.kr/learn/courses/30/lessons/12947?language=java

public class Harshad {
	public static void main(String[] args) {
		System.out.println(solution(13));
	}

	private static boolean solution(int x) {
		int a = 0;
		int tmp = x;
		while(tmp != 0) {
			a += tmp%10;
			tmp /= 10;
		}
		
		if(x % a == 0) return true;
		return false;
	}
}
