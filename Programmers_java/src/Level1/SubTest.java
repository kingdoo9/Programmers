package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class SubTest {
	public static void main(String[] args) {
		int[] example = {1,2,3,4,5};
		int[] example2 = {1,3,2,4,2};
		
		int[] answer = solution(example);
		int[] answer2 = solution(example2);
		
		System.out.println(Arrays.toString(answer));
		System.out.println(Arrays.toString(answer2));
	}

	private static int[] solution(int[] example) {
		ArrayList<Integer> answer = new ArrayList<Integer>(); 
		int ans;
		int[] A = {1,2,3,4,5};
		int[] B = {2,1,2,3,2,4,2,5};
		int[] C = {3,3,1,1,2,2,4,4,5,5};
		int c1=0, c2=0, c3=0, j=0, k=0, l=0;
		
		for(int i = 0; i<example.length; i++) {
			if(A[j] == example[i]) c1++;
			if(B[k] == example[i]) c2++;
			if(C[l] == example[i]) c3++;
			if(++j == A.length) j = 0;
			if(++k == B.length) k = 0;
			if(++l == C.length) l = 0;
		}
		ans = Math.max(Math.max(c1, c2), c3);
		if(ans == c1)answer.add(1);
		if(ans == c2)answer.add(2);
		if(ans == c3)answer.add(3);
		
		
		
		return answer.stream().mapToInt(i -> i).toArray();
	}
}


