package Level1; //https://programmers.co.kr/learn/courses/30/lessons/12935

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Smallest_Number {
   public static void main(String[] args) {
      int[] arr = {4,3,2,1};
      int[] ans = solution(arr);
      System.out.println(Arrays.toString(ans));
   }

   private static int[] solution(int[] arr) {
      ArrayList<Integer> answer = new ArrayList<>();
      int min = arr[0];
      
      for(int i : arr) {
         if(min > i) min = i;
         answer.add(i);
      }
      answer.remove(answer.indexOf(min));
      if(answer.isEmpty()) answer.add(-1);
      return answer.stream().mapToInt(i->i).toArray();
   }
}
