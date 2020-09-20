package Level2;

public class Target_number {
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int ans = solution(numbers, 3);
		System.out.println(ans);
	}

	private static int solution(int[] numbers, int target) {
        int answer = dfs(numbers, 0, 0, target);
        return answer;
	}

	private static int dfs(int[] numbers, int node, int sum, int target) {
		if(numbers.length == node) {
			if(sum == target) return 1;
			return 0;
		}
		
		return dfs(numbers, node+1, sum + numbers[node], target) +
				dfs(numbers, node+1, sum - numbers[node], target);
	}
}
