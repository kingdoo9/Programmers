package Level1;

import java.util.Arrays;
import java.util.Comparator;

public class Error_Rate {
	public static void main(String[] args) {
		int N = 10;
		int[] stages = {1,2,3,4,5,6,7};
		int[] ans = solution(N, stages);
		
		System.out.println(Arrays.toString(ans));
	}

	private static int[] solution(int n, int[] stages) {
		int[] clear = new int[n+2]; // 현 스테이지에 몇 사람이 있는지
		float[][] fail = new float[n][2]; // 각 스테이지별 실패 확률[0] 스테이지[1]
		int[] answer = new int[n];
		int[] person = new int[n+2]; //각 스테이지별 통과한 사람의 수
		
		for(int i: stages) clear[i]++; // 현 스테이지에 총 몇명이 있는지를 나타냄
		
		
		person[0] = stages.length;
		for(int i=1; i<n+2; i++) { // 통과한 사람의 수 계산
			person[i] = person[i-1] - clear[i-1];
		}
		
		for(int i=1; i<n+1; i++) { //실패확률 계산
			if(person[i] == 0) fail[i-1][0] = -1; // 현 스테이지에 도달한 사람이 없다면 실패율은 -1
			else 
				fail[i-1][0] = clear[i]/(float)person[i];
			fail[i-1][1] = i;
		}
		
		Arrays.sort(fail, new Comparator<float[]>() { // 실패율을 오름차순 정리
			@Override
			public int compare(float[] o1, float[] o2) {
				// TODO Auto-generated method stub
				if(o1[0] == o2[0]) return 0;
				return (o1[0] < o2[0])? 1:-1;
			}
		});
		
		for(int i=0; i<n; i++) { //스테이지를 int화 시킴.
			answer[i] = (int) fail[i][1];
		}
		
		return answer;
	}
}
