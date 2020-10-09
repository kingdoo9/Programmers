package Level1; // https://programmers.co.kr/learn/courses/30/lessons/12954

import java.util.ArrayList;
import java.util.Arrays;

public class n_Number_Increase_x {
   public static void main(String[] args) {
      int x = 2;
      int n = 5;
      long[] ans = solution(x, n);
      
      System.out.println(Arrays.toString(ans));
   }

   private static long[] solution(int x, int n) {
      ArrayList<Long> answer = new ArrayList<>();
      for(int i=0; i<n; i++) {
         answer.add(x+(i*(long)x));
      }
      return answer.stream().mapToLong(i->i).toArray();
   }
}
