package Level1;

public class Average {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		double ans = solution(arr);
		System.out.println(ans);
	}

	private static double solution(int[] arr) {
		double answer = 0;
		for(int n : arr)answer += n;
		return answer/arr.length;
	}
}
