package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Divided {
	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int[] arr1 = {2, 36, 1, 3};
		
		int[] ans = solution(arr, 5);
		int[] ans1 = solution(arr1, 1);
		
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(ans1));
	}

	private static int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> ans = new ArrayList<>();
			//divisor로 나누어 떨어지면 ArrayList에 추가함.
		for(int i=0; i<arr.length; i++) if(arr[i] % divisor == 0) ans.add(arr[i]);
			//ArrayList의 길이가 0이면 -1을 추가함.
		if(ans.isEmpty()) ans.add(-1);
			//ArrayList를 정렬된 int배열로 치환.
		return ans.stream().sorted().mapToInt(i->i).toArray();
	}
}
