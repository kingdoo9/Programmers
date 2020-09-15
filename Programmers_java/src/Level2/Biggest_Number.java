package Level2;

import java.util.Arrays;
import java.util.Collections;

public class Biggest_Number {
	public static void main(String[] args) {
		int[] numbers =  {6, 10, 2};
		int[] numbers1 = {3, 30, 34, 5, 9};
		
		String result = solution(numbers);
		String result1 = solution(numbers1);
		
		System.out.println(result);
		System.out.println(result1);
	}

	private static String solution(int[] numbers) {
		String[] tmp = new String[numbers.length];
		String answer = "";
		int count=0;
		String max;
		for(int i=0; i<numbers.length; i++) {
			tmp[i] = Integer.toString(numbers[i]); //���� �迭�� String�迭�� �ű��.
		}
		
		Arrays.sort(tmp, Collections.reverseOrder()); // ���� ����
		
		for(int i=0; i<tmp.length; i++) { 
			max = tmp[i];
			for(int j=i+1; j<tmp.length; j++) {
				if(tmp[i].charAt(0) != tmp[j].charAt(0)) break; //�հ� ���� �ڸ��� �ٸ��ٸ� �н�
				else {
					max = cut(max, tmp[j]); // ���ٸ� �� �� ���ؼ� ū ���� max�� �ִ´�.
					if(!tmp[i].equals(max)) { //swap �Լ�
						String A = tmp[i];
						tmp[i] = tmp[j];
						tmp[j] = A;
					}
				}
			}
		}
		
		
		for(int i=0; i<numbers.length; i++) { //���信 �Ű� ���´�.
			answer += tmp[i];
		}
		
        for(int i=0; i<answer.length()-1; i++) { //�տ� 0�� ���ٸ� 0�� ������ ����.
        	if(answer.charAt(i) == '0') count++;
        	else break;
        }
        return answer.substring(count); // 0�� �����ش�.
	}

	public static String cut(String m, String a) {
		boolean who = true;
		int i=0, j=0;
		while(true) {
			if(m.charAt(i) == a.charAt(j)) { //�� ���ھ� ���Ѵ�.
				if((i+1) == m.length() && (j+1) == a.length()) {
					who = i<j?true:false;
					break;
				}
				if((i+1) != m.length()) i++;
				else i = 0;
				if((j+1) != a.length()) j++;
				else j = 0;
				continue;
			}
			if(m.charAt(i) < a.charAt(j)) { // ���ڸ� ���ڰ� �� ũ�ٸ� ���ڸ��� return
				who = false;
				break;
			}
			else break;
		}
		
		if(who)return m;
		else return a;
	}
}
