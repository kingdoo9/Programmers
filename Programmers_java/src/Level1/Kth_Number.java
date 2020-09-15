package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Kth_Number {
	public static void main(String[] args) {
		int array[] = {1,5,2,6,3,7,4};
		int commands[][] = {{2,5,3},{4,4,1},{1,7,3}};
		int[] result = solution(array, commands);
		System.out.println(Arrays.toString(result));
	}

	private static int[] solution(int[] array, int[][] commands) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] tmp;

		
		for(int i=0; i<commands.length; i++) {
			tmp = new int[commands[i][1] - commands[i][0] + 1];
			int pos=commands[i][0]-1;
			for(int j=0; j<tmp.length; j++) {
				tmp[j] = array[pos];
				pos++;
			}
			Arrays.sort(tmp);
			answer.add(tmp[commands[i][2]-1]);
		}
		
		return answer.stream().mapToInt(i -> i).toArray();
	}
}
