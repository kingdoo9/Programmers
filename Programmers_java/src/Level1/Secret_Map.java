package Level1; //https://programmers.co.kr/learn/courses/30/lessons/17681

import java.util.Arrays;

public class Secret_Map {
   public static void main(String[] args) {
      int n = 5;
      int[] arr1 = {9, 20, 28, 18, 11};
      int[] arr2 = {30, 1, 21, 17, 28};
      
      String[] ans = solution(n, arr1, arr2);
      System.out.println(Arrays.toString(ans));
   }
   private static String[] solution(int n, int[] arr1, int[] arr2) {
      String[] ans = new String[n];
      
      for(int i=0; i<n; i++) {
         ans[i] ="0".repeat(n-Integer.toBinaryString(arr1[i]|arr2[i]).toCharArray().length)+Integer.toBinaryString(arr1[i]|arr2[i]);
         
      }
      
      for(int i=0; i<n; i++) {
         ans[i] = ans[i].replace('1', '#');
         ans[i] = ans[i].replace('0', ' ');
      }

      return ans;
   }
}
