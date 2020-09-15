package Level2;

import java.util.Scanner;

public class String_Compression {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int num = 1;
		String tmp = "";
		int answer = 0;
		int answer2 = s.length();
		
		for(int i = 1; i<=s.length()/2; i++) {
			for(int j = 0; j<=s.length(); j += i) {
				if(i <= s.substring(j).length()) {
					if(tmp.matches(s.substring(j,j+i))) num++;
					else {
						if(num > 1) answer += Integer.toString(num).length();
						answer += tmp.length();
						tmp = s.substring(j,j+i);
						num = 1;
					}
				}else{
					if(num > 1) answer += Integer.toString(num).length();
					answer += s.substring(j-i).length();
				}
			}
			if(answer2 > answer) answer2 = answer;
			answer = 0;
			num = 1;
			tmp = "";
		}
		System.out.println(answer2);
		
		scan.close();
	}
}
