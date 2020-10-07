package Level1;//https://programmers.co.kr/learn/courses/30/lessons/12940?language=java

import java.math.BigInteger;
import java.util.Arrays;

public class Gcd {
	public static void main(String[] args) {
		int n =3, m = 12;
		int[] ans = solution(n,m);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] solution(int n, int m) {
        BigInteger b1 = BigInteger.valueOf(n);
        BigInteger b2 = BigInteger.valueOf(m);
        int gcd = b1.gcd(b2).intValue();
		return new int[] {gcd, (n*m)/gcd};
	}
}
