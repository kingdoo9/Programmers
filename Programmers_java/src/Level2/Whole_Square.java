package Level2;

import java.math.BigInteger;

public class Whole_Square {
	public static void main(String[] args) {
		int W = 9;
		int H = 6;
		long result = solution(W, H);
		
		System.out.println(result);
	}

	private static long solution(int w, int h) {
        long answer = 1;
        BigInteger b1 = BigInteger.valueOf(w);
        BigInteger b2 = BigInteger.valueOf(h);
        
        if(w > h) answer = (w*h - (2*h) - (w-h) + b1.gcd(b2).intValue());
        else answer = (w*h - (2*w) - (h-w) + b1.gcd(b2).intValue());
       
        if(answer < 0) answer = 0;
        return answer;
	}
}
