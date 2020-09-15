package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class No_Same_Number {
	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		int[] ans = solution(arr);
		
		System.out.println(Arrays.toString(ans));
	}

	private static int[] solution(int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int select = -1;
		
		for(int i=0; i<arr.length; i++) { //다른값이면 add, 같은 값이면 pass
			if(select != arr[i]) {
				select = arr[i];
				answer.add(select);
			}
		}
		
		return answer.stream().mapToInt(i -> i).toArray(); //ArrayList를 배열로 치환
	}
}
