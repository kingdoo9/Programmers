package Level1;

import java.util.Arrays;

public class Gym_Suit {
	public static void main(String[] args) {
		int ex1n = 5;
		int[] ex1l = {2,4};
		int[] ex1r = {1,3,5};
		int ex1ans = solution(ex1n, ex1l, ex1r);
		
		int ex2n = 5;
		int[] ex2l = {2,4};
		int[] ex2r = {3};
		int ex2ans = solution(ex2n, ex2l, ex2r);
		
		int ex3n = 3;
		int[] ex3l = {3};
		int[] ex3r = {1};
		int ex3ans = solution(ex3n, ex3l, ex3r);
		
		System.out.println(ex1ans);
		System.out.println(ex2ans);
		System.out.println(ex3ans);
	}

	private static int solution(int n, int[] lost, int[] reserve) {
		int answer = n-lost.length;
		Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i=0; i< lost.length; i++) { //여벌이있지만 도난당한 학생을 먼저 제외
            for(int k=0; k< reserve.length; k++) {
                if(lost[i] == reserve[k]) {
                    lost[i] = -1;
                    reserve[k] = -1;
                    answer++;
                    break;
                }
            }
        }
        for(int i=0; i< lost.length; i++) { // 앞에서 부터 도난 당한 학생을 채움.
            for(int k=0; k< reserve.length; k++) {
                if(lost[i] == reserve[k]-1 || lost[i] == reserve[k]+1) {
                    lost[i] = -1;
                    reserve[k] = -1;
                    answer++;
                    break;
                }
            }
        } 
		
		return answer;
	}
}
