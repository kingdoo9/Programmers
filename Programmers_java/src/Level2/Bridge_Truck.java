package Level2;

import java.util.LinkedList;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/42583
public class Bridge_Truck {
	public static void main(String[] args) {
		int bridge_length = 10;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,70};
		
		int ans = solution(bridge_length, weight, truck_weights);
		System.out.println(ans);
	}

	private static int solution(int bridge_length, int weight, int[] truck_weights) {
		int tmp_weight = weight;
		Queue<Integer> On = new LinkedList<Integer>();
		int answer = 0;
		
		for(int i=0; i<truck_weights.length; i++) {
			if(tmp_weight == weight) {
				answer += bridge_length;
				tmp_weight -= truck_weights[i];
				On.add(truck_weights[i]);
			}else {
				if(tmp_weight >= truck_weights[i]) {
					answer += 1;
					tmp_weight -= truck_weights[i];
					On.add(truck_weights[i]);
				}else {
					tmp_weight += On.poll();
					if(tmp_weight >= truck_weights[i] && tmp_weight != weight) answer += (bridge_length-1-On.size());
					i--;
				}
			}
		}
		
		return ++answer;
	}
}
