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
		
		for(int i=0; i<arr.length; i++) { //�ٸ����̸� add, ���� ���̸� pass
			if(select != arr[i]) {
				select = arr[i];
				answer.add(select);
			}
		}
		
		return answer.stream().mapToInt(i -> i).toArray(); //ArrayList�� �迭�� ġȯ
	}
}
