package Level2;

import java.util.Arrays;

public class Stock_Price {
	public static void main(String[] args) {
		int[] ex1 = {1,2,3,2,3};
		int[] ex1ans = solution(ex1);
		
		System.out.println(Arrays.toString(ex1ans));
	}

	private static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		for(int i = 0; i<prices.length-1; i++) {
			for(int j = i+1; j<prices.length; j++) {
				if(prices[i] > prices[j]) {
					answer[i] = j-i;
					break;
				}
			}
			if(answer[i] ==0) answer[i] = prices.length-1 - i;
		}
		return answer;
	}
}
