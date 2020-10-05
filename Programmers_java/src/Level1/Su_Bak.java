package Level1;

public class Su_Bak {
	public static void main(String[] args) {
		int n = 4;
		String ans = solution(n);
		System.out.println(ans);
	}

	private static String solution(int n) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			if(i%2 == 0) sb.append("¼ö");
			else sb.append("¹Ú");
		}
		
		return sb.toString();
	}
}
