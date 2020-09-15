package Level2;

import java.util.ArrayList;
import java.util.Arrays;

public class Function_Development {
	public static void main(String[] args) {
		int[] ex1p = {93,30,55};
		int[] ex1s = {1,30,5};
		int[] ex1ans = solution(ex1p, ex1s);
		
		int[] ex2p = {95,90,99,99,80,99};
		int[] ex2s = {1,1,1,1,1,1};
		int[] ex2ans = solution(ex2p, ex2s);
		
		System.out.println(Arrays.toString(ex1ans));
		System.out.println(Arrays.toString(ex2ans));
	}

	private static int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] time = new int[progresses.length];
		
		for(int i=0; i<progresses.length; i++) {
			time[i] = (100-progresses[i])/speeds[i];
			if((100-progresses[i])%speeds[i] != 0) time[i]++;
		}
		
		int num = 0, count = 1;
		for(int i=0; i<time.length; i++) {
			if(num == 0) {
				num = time[i];
			}else {
				if(num >= time[i]) count++;
				else {
					answer.add(count);
					num = time[i];
					count = 1;
				}
			}
		}
		answer.add(count);
		return answer.stream().mapToInt(i -> i).toArray();
	}
}
