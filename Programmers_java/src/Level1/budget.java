package Level1;//https://programmers.co.kr/learn/courses/30/lessons/12982

import java.util.Arrays;

public class budget {
   public static void main(String[] args) {
      int[] d = {1,3,2,5,4};
      int budget = 9;
      int ans = solution(d, budget);
      System.out.println(ans);
   }

   private static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
           if(budget > d[i]) {
              budget -= d[i];
              answer++;
           }else {
              break;
           }
        }
        return answer;
   }
}
