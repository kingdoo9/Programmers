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
		int[] clear = new int[n+2]; // �� ���������� �� ����� �ִ���
		float[][] fail = new float[n][2]; // �� ���������� ���� Ȯ��[0] ��������[1]
		int[] answer = new int[n];
		int[] person = new int[n+2]; //�� ���������� ����� ����� ��
		
		for(int i: stages) clear[i]++; // �� ���������� �� ����� �ִ����� ��Ÿ��
		
		
		person[0] = stages.length;
		for(int i=1; i<n+2; i++) { // ����� ����� �� ���
			person[i] = person[i-1] - clear[i-1];
		}
		
		for(int i=1; i<n+1; i++) { //����Ȯ�� ���
			if(person[i] == 0) fail[i-1][0] = -1; // �� ���������� ������ ����� ���ٸ� �������� -1
			else 
				fail[i-1][0] = clear[i]/(float)person[i];
			fail[i-1][1] = i;
		}
		
		Arrays.sort(fail, new Comparator<float[]>() { // �������� �������� ����
			@Override
			public int compare(float[] o1, float[] o2) {
				// TODO Auto-generated method stub
				if(o1[0] == o2[0]) return 0;
				return (o1[0] < o2[0])? 1:-1;
			}
		});
		
		for(int i=0; i<n; i++) { //���������� intȭ ��Ŵ.
			answer[i] = (int) fail[i][1];
		}
		
		return answer;
	}
}
