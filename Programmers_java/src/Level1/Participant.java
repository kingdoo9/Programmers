package Level1;

import java.util.HashMap;
import java.util.Map;

public class Participant {
	public static void main(String[] args) {
		String[] A = {"leo","kiki","eden"};
		String[] A1 = {"eden", "kiki"};
		
		String[] B = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] B1 = {"josipa", "filipa", "marina", "nikola"};
		
		String[] C = {"mislav", "stanko", "mislav", "ana"};
		String[] C1 = {"stanko", "ana", "mislav"};
		
		String answer = Solution(A, A1);
		System.out.println(answer);
		
		answer = Solution(B, B1);
		System.out.println(answer);
		
		answer = Solution(C, C1);
		System.out.println(answer);
		
	}

	private static String Solution(String[] participant, String[] completion) {
        Map<String, Integer> hm = new HashMap<>();
        for(String a : participant) hm.put(a, hm.getOrDefault(a, 0)+1);
        for(String a : completion) hm.put(a, hm.getOrDefault(a, 0)-1);
        for(String a : hm.keySet()){
            if(hm.get(a) != 0) return a;
        }
        
		return null;
	}
}
