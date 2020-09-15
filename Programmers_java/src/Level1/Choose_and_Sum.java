package Level1;

import java.util.Arrays;
import java.util.HashSet;

public class Choose_and_Sum {

	public static void main(String[] args) {
		int[] number = {2,1,3,4,1};
		int[] number1 = {5,0,2,7};

		int[] ans = solution(number);
		int[] ans1 = solution(number1);
		
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(ans1));
	}

	private static int[] solution(int[] number) {
        HashSet<Integer> tmp = new HashSet<>(); //HashSet�� ������.
        
        for(int i=0; i<number.length; i++) { //number�� ���� ���� ���� ���Ͽ� HashSet�� ����.
        	for(int j=i+1; j<number.length; j++) {
        		tmp.add(number[i]+number[j]);
        	}
        }
        int[] answer = tmp.stream().mapToInt(i -> i).toArray(); //HashSet ���� Int�迭�� �ٲ�.
        Arrays.sort(answer); // �迭�� ����
        return answer;
	}

}
