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
			tmp[i] = Integer.toString(numbers[i]); //받은 배열을 String배열로 옮긴다.
		}
		
		Arrays.sort(tmp, Collections.reverseOrder()); // 역순 정렬
		
		for(int i=0; i<tmp.length; i++) { 
			max = tmp[i];
			for(int j=i+1; j<tmp.length; j++) {
				if(tmp[i].charAt(0) != tmp[j].charAt(0)) break; //앞과 뒤의 자리가 다르다면 패스
				else {
					max = cut(max, tmp[j]); // 같다면 둘 중 비교해서 큰 값을 max에 넣는다.
					if(!tmp[i].equals(max)) { //swap 함수
						String A = tmp[i];
						tmp[i] = tmp[j];
						tmp[j] = A;
					}
				}
			}
		}
		
		
		for(int i=0; i<numbers.length; i++) { //정답에 옮겨 적는다.
			answer += tmp[i];
		}
		
        for(int i=0; i<answer.length()-1; i++) { //앞에 0이 많다면 0의 개수를 센다.
        	if(answer.charAt(i) == '0') count++;
        	else break;
        }
        return answer.substring(count); // 0을 없애준다.
	}

	public static String cut(String m, String a) {
		boolean who = true;
		int i=0, j=0;
		while(true) {
			if(m.charAt(i) == a.charAt(j)) { //한 글자씩 비교한다.
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
			if(m.charAt(i) < a.charAt(j)) { // 뒷자리 숫자가 더 크다면 뒷자리를 return
				who = false;
				break;
			}
			else break;
		}
		
		if(who)return m;
		else return a;
	}
}
